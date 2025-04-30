package com.arch.inventory.stream;

import com.arch.commons.domain.BookDO;
import com.arch.inventory.stream.data.BookItemData;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

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
    BookItemData data = new BookItemData();
    data.setBookId(bookDO.getBookId());
    data.setBarcode(bookDO.getBarcode());
    data.setBookFormat(bookDO.getFormat().name());
    data.setBorrowed(false);
    data.setPrice(bookDO.getPrice());
    data.setPublicationDate(bookDO.getPublicationDate());
    data.setPurchaseDate(bookDO.getPurchaseDate());
    data.setStatus(bookDO.getStatus().name());
    BookItemData saved = bookItemRepository.save(data);
    log.info("Book item saved: {}", saved);
  }
}
