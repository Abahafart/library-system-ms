package com.arch.catalogue.framework.output.persistence.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.arch.catalogue.framework.output.persistence.data.BookData;

public interface BookRepository extends CrudRepository<BookData, Long> {

  Optional<BookData> findByIsbn(String isbn);
  Optional<BookData> findByTitle(String title);
  Optional<BookData> findWithAuthorByBookId(long id);

}
