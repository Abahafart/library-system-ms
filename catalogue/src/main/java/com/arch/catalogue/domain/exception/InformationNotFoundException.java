package com.arch.catalogue.domain.exception;

public class InformationNotFoundException extends RuntimeException {

  private String message;
  public InformationNotFoundException(String message) {
    super(message);
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
