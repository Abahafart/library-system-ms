package com.arch.users.application;

import com.arch.users.domain.AccountDO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountManagement {

  Mono<AccountDO> save(Mono<AccountDO> account);
  Flux<AccountDO> findAll();
  Mono<AccountDO> findById(Mono<String> id);
  Mono<Void> deleteById(Mono<String> id);

}
