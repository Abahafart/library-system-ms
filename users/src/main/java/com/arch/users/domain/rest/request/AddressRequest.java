package com.arch.users.domain.rest.request;

import java.io.Serializable;

public class AddressRequest implements Serializable {

  private String street;
  private String suite;
  private String city;
  private String zipcode;
  private String country;

  public AddressRequest() {
  }

  public AddressRequest(String street, String suite, String city, String zipcode, String country) {
    this.street = street;
    this.suite = suite;
    this.city = city;
    this.zipcode = zipcode;
    this.country = country;
  }

  @Override
  public String toString() {
    return "AddressRequest{" +
        "street=" + street +
        ", suite=" + suite +
        ", city=" + city +
        ", zipcode=" + zipcode +
        ", country=" + country +
        '}';
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
}
