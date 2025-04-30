package com.arch.inventory.stream.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arch.inventory.stream.data.BookItemData;

public interface BookItemRepository extends JpaRepository<BookItemData, Long> {

}
