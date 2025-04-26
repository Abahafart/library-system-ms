package com.arch.inventory.stream.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arch.inventory.stream.data.AuthorData;

public interface AuthorRepository extends JpaRepository<AuthorData, Long> {
}
