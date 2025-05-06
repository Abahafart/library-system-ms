package com.arch.users.domain.rest.response;

import com.arch.commons.domain.AccountStatus;
import java.io.Serializable;
import java.time.Instant;

public class AccountResponse implements Serializable {

  private String id;
  private AddressResponse address;
  private String email;
  private String username;
  private String password;
  private String role;
  private String name;
  private String phone;
  private AccountStatus status;
  private String createdAt;
  private String updatedAt;
  private Integer version;

  @Override
  public String toString() {
    return "AccountResponse{" +
        "id=" + id +
        ", address=" + address +
        ", email=" + email +
        ", username=" + username +
        ", password=" + password +
        ", role=" + role +
        ", name=" + name +
        ", phone=" + phone +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", version=" + version +
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

  public AccountStatus getStatus() {
    return status;
  }

  public void setStatus(AccountStatus status) {
    this.status = status;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }
}
