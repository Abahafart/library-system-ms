package com.arch.users.framework.output.repository;

import com.arch.users.framework.output.data.AddressData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface AddressRepository extends ReactiveMongoRepository<AddressData, ObjectId> {

  Mono<AddressData> findByAccountId(String id);

}
