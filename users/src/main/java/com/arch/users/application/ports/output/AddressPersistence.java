package com.arch.users.application.ports.output;

import com.arch.users.domain.AddressDO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AddressPersistence {

  Mono<AddressDO> save(Mono<AddressDO> address);

  Mono<AddressDO> findById(Mono<String> id);

  Mono<Void> deleteById(Mono<String> id);

  Flux<AddressDO> findAll();

}
