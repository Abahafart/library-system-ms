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

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
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

    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder street(String street) {
      this.street = street;
      return this;
    }
    public Builder suite(String suite) {
      this.suite = suite;
      return this;
    }
    public Builder city(String city) {
      this.city = city;
      return this;
    }
    public Builder zipcode(String zipcode) {
      this.zipcode = zipcode;
      return this;
    }
    public Builder country(String country) {
      this.country = country;
      return this;
    }
    public Builder accountId(String accountId) {
      this.accountId = accountId;
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
    public AddressDO build() {
      AddressDO address = new AddressDO();
      address.setId(id);
      address.setStreet(street);
      address.setSuite(suite);
      address.setCity(city);
      address.setZipcode(zipcode);
      address.setCountry(country);
      address.setAccountId(accountId);
      address.setCreatedAt(createdAt);
      address.setUpdatedAt(updatedAt);
      address.setVersion(version);
      return address;
    }
  }
}
