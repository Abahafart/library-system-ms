package com.arch.users.framework.output.repository;

import com.arch.users.framework.output.data.AddressData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AddressRepository extends ReactiveMongoRepository<AddressData, ObjectId> {

}
