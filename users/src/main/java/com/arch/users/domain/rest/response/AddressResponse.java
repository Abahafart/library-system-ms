package com.arch.users.domain.rest.response;

import java.io.Serializable;
import java.time.Instant;

public class AddressResponse implements Serializable {

  private String id;
  private String street;
  private String suite;
  private String city;
  private String zipcode;
  private String country;
  private String accountId;
  private String createdAt;
  private String updatedAt;
  private Integer version;

  public AddressResponse() {
  }

  public AddressResponse(String id, String street, String suite, String city, String zipcode,
      String country, String accountId, String createdAt, String updatedAt, Integer version) {
    this.id = id;
    this.street = street;
    this.suite = suite;
    this.city = city;
    this.zipcode = zipcode;
    this.country = country;
    this.accountId = accountId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.version = version;
  }

  @Override
  public String toString() {
    return "AddressResponse{" +
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

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
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
