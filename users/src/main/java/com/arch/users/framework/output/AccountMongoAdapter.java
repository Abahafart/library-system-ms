package com.arch.users.framework.output;

import org.springframework.stereotype.Repository;

import com.arch.users.application.ports.output.AccountPersistence;
import com.arch.users.domain.AccountDO;
import com.arch.users.framework.mappers.AccountMapper;
import com.arch.users.framework.output.data.AccountData;
import com.arch.users.framework.output.repository.AccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class AccountMongoAdapter implements AccountPersistence {

  private final AccountMapper mapper;
  private final AccountRepository accountRepository;

  public AccountMongoAdapter(AccountMapper mapper, AccountRepository accountRepository) {
    this.mapper = mapper;
    this.accountRepository = accountRepository;
  }

  @Override
  public Mono<AccountDO> save(Mono<AccountDO> account) {
    return account.map(mapper::toEntity)
        .flatMap(accountRepository::save)
        .map(mapper::toModel);
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
