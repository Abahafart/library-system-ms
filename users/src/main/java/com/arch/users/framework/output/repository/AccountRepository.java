package com.arch.users.framework.output.repository;

import com.arch.users.framework.output.data.AccountData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<AccountData, ObjectId> {

}
