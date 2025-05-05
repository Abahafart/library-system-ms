package com.arch.users.domain;

import com.arch.commons.domain.AccountStatus;
import java.time.Instant;

public class AccountDO {

  private String id;
  private String email;
  private String username;
  private String password;
  private String role;
  private String name;
  private AddressDO address;
  private String phone;
  private AccountStatus status;
  private Instant createdAt;
  private Instant updatedAt;
  private Integer version;

  @Override
  public String toString() {
    return "AccountDO{" +
        "id=" + id +
        ", email=" + email +
        ", username=" + username +
        ", password=" + password +
        ", role=" + role +
        ", name=" + name +
        ", address=" + address +
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

  public AddressDO getAddress() {
    return address;
  }

  public void setAddress(AddressDO address) {
    this.address = address;
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

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String id;
    private String email;
    private String username;
    private String password;
    private String role;
    private String name;
    private AddressDO address;
    private String phone;
    private AccountStatus status;
    private Instant createdAt;
    private Instant updatedAt;
    private Integer version;

    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder email(String email) {
      this.email = email;
      return this;
    }
    public Builder username(String username) {
      this.username = username;
      return this;
    }
    public Builder password(String password) {
      this.password = password;
      return this;
    }
    public Builder role(String role) {
      this.role = role;
      return this;
    }
    public Builder name(String name) {
      this.name = name;
      return this;
    }
    public Builder address(AddressDO address) {
      this.address = address;
      return this;
    }
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }
    public Builder status(AccountStatus status) {
      this.status = status;
      return this;
    }
    public Builder createdAt(Instant createdAt) {
      this.createdAt = createdAt;
      return this;
    }
    public Builder updatedAt(Instant updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
    public Builder version(Integer version) {
      this.version = version;
      return this;
    }
    public AccountDO build() {
      AccountDO account = new AccountDO();
      account.setId(id);
      account.setEmail(email);
      account.setUsername(username);
      account.setPassword(password);
      account.setRole(role);
      account.setName(name);
      account.setAddress(address);
      account.setPhone(phone);
      account.setStatus(status);
      account.setCreatedAt(createdAt);
      account.setUpdatedAt(updatedAt);
      account.setVersion(version);
      return account;
    }
  }
}
