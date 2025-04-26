package com.arch.catalogue.framework.output.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arch.catalogue.framework.output.persistence.data.AuthorData;

public interface AuthorRepository extends CrudRepository<AuthorData, Long> {

  List<AuthorData> findByNameContainingIgnoreCase(String name);
}
