package com.arch.catalogue.application.usecases;

import com.arch.catalogue.domain.AuthorDO;

public interface AuthorManagement {

  AuthorDO createAuthor(AuthorDO author);
  AuthorDO getAuthorById(long authorId);
  void deleteAuthorById(long authorId);

}
