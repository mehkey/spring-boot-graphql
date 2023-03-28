package com.mehkey.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mehkey.graphql.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
