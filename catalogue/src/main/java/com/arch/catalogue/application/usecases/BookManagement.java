package com.arch.catalogue.application.usecases;

import com.arch.commons.domain.BookDO;
import java.util.Map;

public interface BookManagement {

  BookDO createBook(BookDO book);
  int countBooks();
  BookDO getBookByISBN(String ISBN);
  BookDO getBookByTitle(String title);
  BookDO updateBook(BookDO book);
  void deleteBook(long bookId);
  BookDO getBookByParams(Map<String, String> params);

}
