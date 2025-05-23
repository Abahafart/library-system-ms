package com.arch.users.domain.rest.request;

import com.arch.commons.domain.Role;
import java.io.Serializable;

import com.arch.commons.domain.AccountStatus;

public class AccountRequest implements Serializable {

  private String email;
  private String username;
  private String password;
  private Role role;
  private String name;
  private String phone;
  private AddressRequest address;
  private AccountStatus status;

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

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
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
