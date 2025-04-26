package com.arch.catalogue.application.ports.input;

import static com.arch.catalogue.domain.constant.InformationParams.ISBN;
import static com.arch.catalogue.domain.constant.InformationParams.TITLE;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.arch.catalogue.application.ports.output.AuthorPersistenceManagement;
import com.arch.catalogue.application.ports.output.BookPersistenceManagement;
import com.arch.catalogue.application.ports.output.BookStreamManagement;
import com.arch.catalogue.application.usecases.BookManagement;
import com.arch.catalogue.domain.AuthorDO;
import com.arch.catalogue.domain.BookDO;

@Service
public class BookManagementInputAdapter implements BookManagement {

  private final BookPersistenceManagement persistenceManagement;
  private final AuthorPersistenceManagement authorPersistenceManagement;
  private final BookStreamManagement streamManagement;

  public BookManagementInputAdapter(BookPersistenceManagement persistenceManagement,
      AuthorPersistenceManagement authorPersistenceManagement,
      BookStreamManagement streamManagement) {
    this.persistenceManagement = persistenceManagement;
    this.authorPersistenceManagement = authorPersistenceManagement;
    this.streamManagement = streamManagement;
  }

  @Override
  public BookDO createBook(BookDO book) {
    AuthorDO found = authorPersistenceManagement.getAuthorById(book.getAuthor());
    book.setAuthor(found.authorId());
    BookDO saved = persistenceManagement.save(book);
    saved.setAuthor(found.authorId());
    streamManagement.notificationNewBook(saved);
    return saved;
  }

  @Override
  public int countBooks() {
    return persistenceManagement.countBooks();
  }

  @Override
  public BookDO getBookByISBN(String ISBN) {
    return persistenceManagement.getBookByISBN(ISBN);
  }

  @Override
  public BookDO getBookByTitle(String title) {
    return persistenceManagement.getBookByTitle(title);
  }

  @Override
  public BookDO updateBook(BookDO book) {
    return persistenceManagement.update(book);
  }

  @Override
  public void deleteBook(long bookId) {
    persistenceManagement.delete(bookId);
  }

  @Override
  public BookDO getBookByParams(Map<String, String> params) {
    BookDO found = new BookDO();
    if (params.get(ISBN) != null) {
      found = getBookByISBN(params.get(ISBN));
    }
    if (params.get(TITLE) != null) {
      found = getBookByTitle(params.get(TITLE));
    }
    return found;
  }
}
