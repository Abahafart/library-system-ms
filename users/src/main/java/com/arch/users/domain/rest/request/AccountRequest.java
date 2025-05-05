package com.arch.users.domain.rest.request;

import java.io.Serializable;

import com.arch.commons.domain.AccountStatus;

public class AccountRequest implements Serializable {

  private String email;
  private String username;
  private String password;
  private String role;
  private String name;
  private String phone;
  private AddressRequest address;
  private AccountStatus status;

  public AccountRequest() {
  }

  public AccountRequest(String email, String username, String password, String role, String name,
      String phone, AddressRequest address, AccountStatus status) {
    this.email = email;
    this.username = username;
    this.password = password;
    this.role = role;
    this.name = name;
    this.phone = phone;
    this.address = address;
    this.status = status;
  }

  @Override
  public String toString() {
    return "AccountRequest{" +
        "username=" + username  +
        ", password=" + password +
        ", role=" + role +
        ", name=" + name +
        ", phone=" + phone +
        ", address=" + address +
        ", status=" + status +
        '}';
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AddressRequest getAddress() {
    return address;
  }

  public void setAddress(AddressRequest address) {
    this.address = address;
  }

  public AccountStatus getStatus() {
    return status;
  }

  public void setStatus(AccountStatus status) {
    this.status = status;
  }
}
