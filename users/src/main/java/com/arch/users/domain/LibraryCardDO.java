package com.arch.users.domain;

import com.arch.commons.domain.LibraryCardStatus;
import java.time.Instant;

public class LibraryCardDO {
  private String id;
  private String accountId;
  private String cardNumber;
  private String barcode;
  private LibraryCardStatus status;
  private Instant createdAt;
  private Instant updatedAt;
  private Integer version;

  private LibraryCardDO(Builder builder) {
    this.id = builder.id;
    this.accountId = builder.accountId;
    this.cardNumber = builder.cardNumber;
    this.barcode = builder.barcode;
    this.status = builder.status;
    this.createdAt = builder.createdAt;
    this.updatedAt = builder.updatedAt;
    this.version = builder.version;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String id;
    private String accountId;
    private String cardNumber;
    private String barcode;
    private LibraryCardStatus status;
    private Instant createdAt;
    private Instant updatedAt;
    private Integer version;

    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
    public Builder cardNumber(String cardNumber) {
      this.cardNumber = cardNumber;
      return this;
    }
    public Builder barcode(String barcode) {
      this.barcode = barcode;
      return this;
    }
    public Builder status(LibraryCardStatus status) {
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
    public LibraryCardDO build() {
      return new LibraryCardDO(this);
    }
  }

  public String getId() { return id; }
  public String getAccountId() { return accountId; }
  public String getCardNumber() { return cardNumber; }
  public String getBarcode() { return barcode; }
  public LibraryCardStatus getStatus() { return status; }
  public Instant getCreatedAt() { return createdAt; }
  public Instant getUpdatedAt() { return updatedAt; }
  public Integer getVersion() { return version; }
}
