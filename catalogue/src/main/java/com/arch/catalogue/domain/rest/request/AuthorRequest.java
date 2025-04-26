package com.arch.catalogue.domain.rest.request;

import java.io.Serializable;

public class AuthorRequest implements Serializable {

  @Override
  public String toString() {
    return "AuthorRequest {" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }

  private String name;
  private String description;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
