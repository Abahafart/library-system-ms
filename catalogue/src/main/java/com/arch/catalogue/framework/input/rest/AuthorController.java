package com.arch.catalogue.framework.input.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arch.catalogue.application.usecases.AuthorManagement;
import com.arch.catalogue.domain.AuthorDO;
import com.arch.catalogue.domain.rest.request.AuthorRequest;
import com.arch.catalogue.domain.rest.response.AuthorResponse;

@RestController
@RequestMapping("/authors")
public class AuthorController {

  private final AuthorManagement authorManagement;

  public AuthorController(AuthorManagement authorManagement) {
    this.authorManagement = authorManagement;
  }

  @PostMapping
  public AuthorResponse save(@RequestBody AuthorRequest request) {
    AuthorDO authorDO = new AuthorDO(request.getName(), request.getDescription());
    AuthorDO created = authorManagement.createAuthor(authorDO);
    return new AuthorResponse(created.authorId(), created.name(), created.description(), created.createdAt(), created.updatedAt(), created.version());
  }

}
