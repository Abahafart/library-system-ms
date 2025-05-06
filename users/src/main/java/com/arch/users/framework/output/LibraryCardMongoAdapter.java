package com.arch.users.framework.output;

import com.arch.users.application.ports.output.LibraryCardPersistence;
import com.arch.users.domain.LibraryCardDO;
import com.arch.users.framework.mappers.LibraryCardMapper;
import com.arch.users.framework.output.data.LibraryCardData;
import com.arch.users.framework.output.data.LibraryCounterData;
import com.arch.users.framework.output.repository.LibraryCardRepository;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class LibraryCardMongoAdapter implements LibraryCardPersistence {

  private final LibraryCardRepository libraryCardRepository;
  private final LibraryCardMapper mapper;
  private final ReactiveMongoOperations reactiveMongoOperations;
  private static final String COLLECTION_NAME = "library_counters";
  private static final String PREFIX = "LIBRARY_CARD_";
  private static final String POSTFIX = "_";

  public LibraryCardMongoAdapter(LibraryCardRepository libraryCardRepository,
      LibraryCardMapper mapper, ReactiveMongoOperations reactiveMongoOperations) {
    this.libraryCardRepository = libraryCardRepository;
    this.mapper = mapper;
    this.reactiveMongoOperations = reactiveMongoOperations;
  }

  @Override
  public Mono<LibraryCardDO> createCard(Mono<LibraryCardDO> libraryCard) {
    return libraryCard.flatMap(it -> {
      LibraryCardData data = mapper.toEntity(it);
      return libraryCardRepository.save(data);
    }).map(mapper::toModel);
  }

  @Override
  public Mono<String> getCount() {
    return reactiveMongoOperations.findAndModify(
        Query.query(Criteria.where("id").is(COLLECTION_NAME)),
        new Update().inc("count", 1),
        FindAndModifyOptions.options().returnNew(true).upsert(true),
        LibraryCounterData.class
    ).map(LibraryCounterData::getCount).map(it -> PREFIX + it + POSTFIX);
  }
}
