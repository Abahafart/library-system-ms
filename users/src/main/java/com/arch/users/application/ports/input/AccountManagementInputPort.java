package com.arch.users.application.ports.input;

import org.springframework.stereotype.Service;

import com.arch.users.application.AccountManagement;
import com.arch.users.application.ports.output.AccountPersistence;
import com.arch.users.application.ports.output.AddressPersistence;
import com.arch.users.domain.AccountDO;
import com.arch.users.domain.AddressDO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountManagementInputPort implements AccountManagement {

  private final AccountPersistence accountPersistence;
  private final AddressPersistence addressPersistence;

  public AccountManagementInputPort(AccountPersistence accountPersistence,
      AddressPersistence addressPersistence) {
    this.accountPersistence = accountPersistence;
    this.addressPersistence = addressPersistence;
  }

  @Override
  public Mono<AccountDO> save(Mono<AccountDO> account) {
    return accountPersistence.save(account).flatMap(it -> {
      AddressDO address = it.getAddress();
      address.setAccountId(it.getId());
      return addressPersistence.save(Mono.just(address)).map(it2 -> it);
    });
  }

  @Override
  public Flux<AccountDO> findAll() {
    return null;
  }

  @Override
  public Mono<AccountDO> findById(Mono<String> id) {
    return null;
  }

  @Override
  public Mono<Void> deleteById(Mono<String> id) {
    return null;
  }
}
