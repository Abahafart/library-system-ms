package com.arch.users.framework.output.data;

import com.arch.commons.domain.AddressStatus;
import java.time.Instant;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "addresses")
public class AddressData {

  @Id
  private ObjectId id;
  private String street;
  private String suite;
  private String city;
  private String zipcode;
  private String country;
  private ObjectId accountId;
  private AddressStatus status;
  private Instant createdAt;
  private Instant updatedAt;
  @Version
  private Integer version;

  @Override
  public String toString() {
    return "AddressData{" +
        "id=" + id +
        ", street=" + street +
        ", suite=" + suite +
        ", city=" + city +
        ", zipcode=" + zipcode +
        ", country=" + country +
        ", accountId=" + accountId +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", version=" + version +
        '}';
  }

  public AddressStatus getStatus() {
    return status;
  }

  public void setStatus(AddressStatus status) {
    this.status = status;
  }

  public ObjectId getAccountId() {
    return accountId;
  }

  public void setAccountId(ObjectId accountId) {
    this.accountId = accountId;
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

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
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
