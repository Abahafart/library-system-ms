package com.arch.users.framework.output.data;

import com.arch.commons.domain.AccountStatus;
import java.time.Instant;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
public class AccountData {

  @Id
  private String id;
  private String username;
  private String password;
  private String role;
  private String name;
  private String phone;
  private AccountStatus status;
  private Instant createdAt;
  private Instant updatedAt;
  @Version
  private Integer version;

  @Override
  public String toString() {
    return "AccountData{" +
        "id=" + id +
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
}
