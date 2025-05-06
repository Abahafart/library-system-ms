package com.arch.users.application.ports.input;

import com.arch.commons.domain.LibraryCardStatus;
import com.arch.users.application.AccountManagement;
import com.arch.users.application.BarcodeManagement;
import com.arch.users.application.ports.output.AccountPersistence;
import com.arch.users.application.ports.output.AddressPersistence;
import com.arch.users.application.ports.output.LibraryCardPersistence;
import com.arch.users.domain.AccountDO;
import com.arch.users.domain.AddressDO;
import com.arch.users.domain.LibraryCardDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountManagementInputPort implements AccountManagement {

  private static final Logger log = LoggerFactory.getLogger(AccountManagementInputPort.class);
  private final AccountPersistence accountPersistence;
  private final AddressPersistence addressPersistence;
  private final PasswordHasManagementInputPort passwordManagement;
  private final LibraryCardPersistence libraryCardPersistence;
  private final BarcodeManagement barcodeManagement;

  public AccountManagementInputPort(AccountPersistence accountPersistence,
      AddressPersistence addressPersistence,
      PasswordHasManagementInputPort passwordManagement,
      LibraryCardPersistence libraryCardPersistence, BarcodeManagement barcodeManagement) {
    this.accountPersistence = accountPersistence;
    this.addressPersistence = addressPersistence;
    this.passwordManagement = passwordManagement;
    this.libraryCardPersistence = libraryCardPersistence;
    this.barcodeManagement = barcodeManagement;
  }

  @Override
  public Mono<AccountDO> save(Mono<AccountDO> account) {
    account.subscribe(it -> {
      it.setPassword(passwordManagement.hash(it.getPassword()));
      log.info("hashed");
    });
    return accountPersistence.save(account).flatMap(it -> {
      account.map(acc -> {
        acc.getAddress().setAccountId(it.getId());
        log.info("AccountId set: {}", it.getId());
        it.setAddress(acc.getAddress());
        return it;
      });
      account.flatMap(it2 -> Mono.zip(Mono.just(it2), libraryCardPersistence.getCount())).flatMap(it3 -> {
        LibraryCardDO libraryCardDO = LibraryCardDO.builder()
            .cardNumber(it3.getT2())
            .barcode(barcodeManagement.generate(it3.getT2()))
            .accountId(it3.getT1().getId())
            .status(LibraryCardStatus.ACTIVE)
            .build();
        return libraryCardPersistence.createCard(Mono.just(libraryCardDO));
      });
      return addressPersistence.save(Mono.just(it.getAddress())).map(it2 -> {
        it.setAddress(it2);
        log.info("Address saved: {}", it2);
        it.setPassword("");
        return it;
      });
    });
  }

  @Override
  public Flux<AccountDO> findAll() {
    return accountPersistence.findAll().map(it -> {
      it.setPassword("");
      return it;
    });
  }

  @Override
  public Mono<AccountDO> findById(Mono<String> id) {
    return accountPersistence.findById(id).flatMap(it ->
        addressPersistence.findByAccountId(it.getId())
            .defaultIfEmpty(AddressDO.builder().build())
            .map(it2 -> {
              it.setAddress(it2);
              it.setPassword("");
              return it;
            }));
  }

  @Override
  public Mono<Void> deleteById(Mono<String> id) {
    return accountPersistence.deleteById(id);
  }

  @Override
  public Mono<AccountDO> findByEmail(Mono<String> email) {
    return accountPersistence.findByEmail(email).map(it -> {
      it.setPassword("");
      return it;
    });
  }

  @Override
  public Mono<AccountDO> findByUsername(Mono<String> username) {
    return accountPersistence.findByUsername(username).map(it -> {
      it.setPassword("");
      return it;
    });
  }

  @Override
  public Flux<AccountDO> findByName(Mono<String> name) {
    return accountPersistence.findByName(name).map(it -> {
      it.setPassword("");
      return it;
    });
  }
}
