package com.arch.catalogue.application.ports.output;

import com.arch.catalogue.domain.BookDO;

public interface BookPersistenceManagement {

  BookDO save(BookDO book);
  BookDO update(BookDO book);
  void delete(long bookId);
  int countBooks();
  BookDO getBookByISBN(String ISBN);
  BookDO getBookByTitle(String title);
  BookDO getBookById(Long id);
}
