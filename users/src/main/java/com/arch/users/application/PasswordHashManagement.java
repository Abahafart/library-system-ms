package com.arch.users.application;

public interface PasswordHashManagement {

  String hash(String password);
  boolean matches(String password, String hash);
}
