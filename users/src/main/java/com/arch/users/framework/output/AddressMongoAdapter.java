package com.arch.users.framework.output;

import com.arch.users.application.output.AccountPersistence;
import com.arch.users.domain.AccountDO;
import com.arch.users.framework.mappers.AccountMapper;
import com.arch.users.framework.output.repository.AddressRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class AddressMongoAdapter implements AccountPersistence {

  private final AddressRepository addressRepository;
  private final AccountMapper mapper;

  public AddressMongoAdapter(AddressRepository addressRepository, AccountMapper mapper) {
    this.addressRepository = addressRepository;
    this.mapper = mapper;
  }

  @Override
  public Mono<AccountDO> save(Mono<AccountDO> account) {
    return null;
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
