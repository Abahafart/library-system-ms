package com.arch.users.framework.output.data;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "library_counters")
public class LibraryCounterData {

  private String id;
  private long count;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }
}
