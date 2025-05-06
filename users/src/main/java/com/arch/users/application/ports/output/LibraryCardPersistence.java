package com.arch.users.application.ports.output;

import com.arch.users.domain.LibraryCardDO;
import reactor.core.publisher.Mono;

public interface LibraryCardPersistence {

  Mono<LibraryCardDO> createCard(Mono<LibraryCardDO> libraryCard);
  Mono<String> getCount();
}
