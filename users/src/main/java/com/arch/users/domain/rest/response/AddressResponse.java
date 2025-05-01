package com.arch.users.domain.rest.response;

import java.io.Serializable;

public class AddressResponse implements Serializable {

  private String id;

  public AddressResponse() {
  }

  public AddressResponse(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "AddressRequest{" +
        "id=" + id +
        '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
