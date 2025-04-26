package com.arch.catalogue.application.ports.output;

import java.util.List;

import com.arch.catalogue.domain.AuthorDO;

public interface AuthorPersistenceManagement {

  AuthorDO save(AuthorDO author);
  AuthorDO getAuthorById(long authorId);
  void deleteAuthorById(long authorId);
  List<AuthorDO> findAuthorsByName(String name);

}
