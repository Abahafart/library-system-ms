package com.arch.users.framework.output.repository;

import com.arch.users.framework.output.data.AccountData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository extends ReactiveMongoRepository<AccountData, ObjectId> {

  Mono<AccountData> findByUsername(String username);
  Mono<AccountData> findByEmail(String email);
  Flux<AccountData> findByName(String name);
}
