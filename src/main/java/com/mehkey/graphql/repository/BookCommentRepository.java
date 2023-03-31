package com.mehkey.graphql.repository;

import com.mehkey.graphql.model.BookComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mehkey.graphql.model.BookComment;

@Repository
public interface BookCommentRepository extends JpaRepository<BookComment, Long> {

}
