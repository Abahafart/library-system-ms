package com.arch.catalogue.application.ports.input;

import org.springframework.stereotype.Service;

import com.arch.catalogue.application.ports.output.AuthorPersistenceManagement;
import com.arch.catalogue.application.usecases.AuthorManagement;
import com.arch.catalogue.domain.AuthorDO;

@Service
public class AuthorManagementInputPort implements AuthorManagement {

  private final AuthorPersistenceManagement authorPersistenceManagement;

  public AuthorManagementInputPort(AuthorPersistenceManagement authorPersistenceManagement) {
    this.authorPersistenceManagement = authorPersistenceManagement;
  }

  @Override
  public AuthorDO createAuthor(AuthorDO author) {
    return authorPersistenceManagement.save(author);
  }

  @Override
  public AuthorDO getAuthorById(long authorId) {
    return authorPersistenceManagement.getAuthorById(authorId);
  }

  @Override
  public void deleteAuthorById(long authorId) {
    authorPersistenceManagement.deleteAuthorById(authorId);
  }
}
