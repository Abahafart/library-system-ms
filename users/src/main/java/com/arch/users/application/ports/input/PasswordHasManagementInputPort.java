package com.arch.users.application.ports.input;

import com.arch.users.application.PasswordHashManagement;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordHasManagementInputPort implements PasswordHashManagement {

  private static final int ITERATIONS = 5;
  private static final int MEMORY_LIMIT = 10240;
  private static final int HASH_LENGTH = 32;
  private static final int PARALLELISM = 1;
  private static final int SALT_LENGTH = 16;
  private final Argon2PasswordEncoder passwordEncoder = new Argon2PasswordEncoder(SALT_LENGTH, HASH_LENGTH, PARALLELISM, MEMORY_LIMIT, ITERATIONS);
  @Override
  public String hash(String password) {
    return passwordEncoder.encode(password);
  }

  @Override
  public boolean matches(String password, String hash) {
    return passwordEncoder.matches(password, hash);
  }
}
