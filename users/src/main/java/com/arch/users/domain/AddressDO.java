package com.arch.users.domain;

import java.time.Instant;

public class AddressDO {

  private String id;
  private String street;
  private String suite;
  private String city;
  private String zipcode;
  private String country;
  private String accountId;
  private Instant createdAt;
  private Instant updatedAt;
  private Integer version;

  @Override
  public String toString() {
    return "AddressDO{" +
        "id=" + id +
        ", street=" + street +
        ", suite=" + suite +
        ", city=" + city +
        ", zipcode=" + zipcode +
        ", country=" + country +
        ", accountId=" + accountId +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", version=" + version +
        '}';
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getSuite() {
    return suite;
  }

  public void setSuite(String suite) {
    this.suite = suite;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
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
