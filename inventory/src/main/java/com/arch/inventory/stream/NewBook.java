package com.arch.inventory.stream;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.arch.inventory.stream.domain.BookDO;
import com.arch.inventory.stream.repository.BookItemRepository;

@Component
public class NewBook implements Consumer<BookDO> {

  private static final Logger log = LoggerFactory.getLogger(NewBook.class);
  private final BookItemRepository bookItemRepository;

  public NewBook(BookItemRepository bookItemRepository) {
    this.bookItemRepository = bookItemRepository;
  }

  @Override
  public void accept(BookDO bookDO) {
    log.info("Book published: {}", bookDO);
  }
}
