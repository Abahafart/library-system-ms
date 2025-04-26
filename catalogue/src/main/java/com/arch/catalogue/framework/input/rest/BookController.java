package com.arch.catalogue.framework.input.rest;

import static com.arch.catalogue.domain.constant.InformationParams.ISBN;
import static com.arch.catalogue.domain.constant.InformationParams.TITLE;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arch.catalogue.application.usecases.BookManagement;
import com.arch.catalogue.domain.BookDO;
import com.arch.catalogue.domain.rest.request.BookRequest;
import com.arch.catalogue.domain.rest.response.AuthorResponse;
import com.arch.catalogue.domain.rest.response.BookResponse;
import com.arch.catalogue.framework.mapper.BookMapper;

@RestController
@RequestMapping("/books")
public class BookController {

  private final BookManagement bookManagement;
  private final BookMapper bookMapper;

  public BookController(BookManagement bookManagement, BookMapper bookMapper) {
    this.bookManagement = bookManagement;
    this.bookMapper = bookMapper;
  }

  @PostMapping
  public BookResponse addBook(@RequestBody BookRequest request) {
    BookDO book = bookMapper.fromRequest(request);
    book.setAuthor(request.getAuthorId());
    BookDO created = bookManagement.createBook(book);
    return createResponse(created);
  }

  @GetMapping
  public BookResponse getBookByParams(@RequestParam String isbn,@RequestParam(required = false) String title) {
    Map<String, String> params = new HashMap<>();
    params.put(ISBN, isbn);
    params.put(TITLE, title);
    BookDO found = bookManagement.getBookByParams(params);
    return createResponse(found);
  }

  @GetMapping("/count")
  public int getNumberOfBooks() {
    return bookManagement.countBooks();
  }

  @DeleteMapping("{bookId}")
  public void deleteBook(@PathVariable long bookId) {
    bookManagement.deleteBook(bookId);
  }

  protected BookResponse createResponse(BookDO model) {
    return new BookResponse(model.getBookId(), model.getTitle(), model.getIsbn(),
        model.getLanguage(), model.getNumberOfPages(),
        new AuthorResponse(model.getAuthor()), model.getCreatedAt(),
        model.getUpdatedAt(), model.getVersion());
  }

}
