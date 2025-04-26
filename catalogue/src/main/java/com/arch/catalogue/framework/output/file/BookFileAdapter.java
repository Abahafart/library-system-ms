package com.arch.catalogue.framework.output.file;

import java.util.List;

import org.springframework.stereotype.Component;

import com.arch.catalogue.application.ports.output.BookFile;
import com.arch.catalogue.framework.output.persistence.data.AuthorData;
import com.arch.catalogue.framework.output.persistence.data.BookData;
import com.arch.catalogue.framework.output.persistence.repository.AuthorRepository;
import com.arch.catalogue.framework.output.persistence.repository.BookRepository;
import com.github.javafaker.Faker;

@Component
public class BookFileAdapter implements BookFile {

  private final BookRepository bookRepository;
  private final Faker faker;
  private final AuthorRepository authorRepository;

  public BookFileAdapter(BookRepository bookRepository, Faker faker,
      AuthorRepository authorRepository) {
    this.bookRepository = bookRepository;
    this.faker = faker;
    this.authorRepository = authorRepository;
  }

  @Override
  public void generateBooks() {
    List<AuthorData> authors = (List<AuthorData>) authorRepository.findAll();
    int totalAuthors = authors.size();
    int count = 0;
    for (int i = 0; i < 20000; i++) {
      if (count == totalAuthors) {
        count = 0;
      }
      BookData bookData = new BookData();
      bookData.setTitle(faker.book().title());
      bookData.setIsbn(faker.code().isbn13(true));
      bookData.setLanguage("English");
      bookData.setSubject(faker.book().title());
      bookData.setNumberOfPages(faker.number().numberBetween(1, 1000));
      bookData.setPublisher(faker.book().publisher());
      bookData.setAuthor(authors.get(count).getAuthorId());
      bookRepository.save(bookData);
      count++;
    }
  }
}
