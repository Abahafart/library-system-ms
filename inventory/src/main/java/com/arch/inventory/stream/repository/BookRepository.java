package com.arch.inventory.stream.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arch.inventory.stream.data.BookData;

public interface BookRepository extends JpaRepository<BookData, Long> {

}
