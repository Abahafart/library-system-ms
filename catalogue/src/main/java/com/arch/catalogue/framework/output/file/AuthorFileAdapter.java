package com.arch.catalogue.framework.output.file;

import org.springframework.stereotype.Component;

import com.arch.catalogue.application.ports.output.AuthorFile;
import com.arch.catalogue.framework.output.persistence.data.AuthorData;
import com.arch.catalogue.framework.output.persistence.repository.AuthorRepository;
import com.github.javafaker.Faker;

@Component
public class AuthorFileAdapter implements AuthorFile {

  private final Faker faker;
  private final AuthorRepository authorRepository;

  public AuthorFileAdapter(Faker faker, AuthorRepository authorRepository) {
    this.faker = faker;
    this.authorRepository = authorRepository;
  }

  @Override
  public void createRecords() {
    for (int i = 0; i < 10; i++) {
      AuthorData authors = new AuthorData();
      authors.setName(faker.name().fullName());
      authors.setDescription(faker.color().name());
      authorRepository.save(authors);
    }
  }
}
