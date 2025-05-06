package com.arch.users.framework.output.repository;

import com.arch.users.framework.output.data.LibraryCardData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface LibraryCardRepository extends ReactiveMongoRepository<LibraryCardData, String> {

}
