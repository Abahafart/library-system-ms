package com.arch.users.application;

import com.arch.users.domain.AccountDO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountManagement {

  Mono<AccountDO> save(Mono<AccountDO> account);
  Flux<AccountDO> findAll();
  Mono<AccountDO> findById(Mono<String> id);
  Mono<Void> deleteById(Mono<String> id);
  Mono<AccountDO> findByEmail(Mono<String> email);
  Mono<AccountDO> findByUsername(Mono<String> username);
  Flux<AccountDO> findByName(Mono<String> name);
}
