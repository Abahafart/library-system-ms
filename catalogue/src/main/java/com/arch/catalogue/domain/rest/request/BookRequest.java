package com.arch.catalogue.domain.rest.request;

import java.io.Serializable;

public class BookRequest implements Serializable {

  private String title;
  private String isbn;
  private String subject;
  private String publisher;
  private String language;
  private int numberOfPages;
  private long authorId;
  private int items;

  @Override
  public String toString() {
    return "BookRequest{" +
        "title='" + title + '\'' +
        ", isbn='" + isbn + '\'' +
        ", subject='" + subject + '\'' +
        ", publisher='" + publisher + '\'' +
        ", language='" + language + '\'' +
        ", numberOfPages=" + numberOfPages +
        ", authorId=" + authorId +
        ", items=" + items +
        '}';
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }

  public int getItems() {
    return items;
  }

  public void setItems(int items) {
    this.items = items;
  }
}
