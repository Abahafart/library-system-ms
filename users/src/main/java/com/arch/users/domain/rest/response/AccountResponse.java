package com.arch.users.domain.rest.response;

import java.io.Serializable;

public class AccountResponse implements Serializable {

  private String id;
  private AddressResponse address;

  public AccountResponse() {
  }

  public AccountResponse(String id, AddressResponse address) {
    this.id = id;
    this.address = address;
  }

  @Override
  public String toString() {
    return "AccountResponse{" +
        "id=" + id +
        ", address=" + address +
        '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AddressResponse getAddress() {
    return address;
  }

  public void setAddress(AddressResponse address) {
    this.address = address;
  }
}
