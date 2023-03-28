package com.mehkey.graphql.resolver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mehkey.graphql.DTO.BookContentDTO;
import com.mehkey.graphql.service.BookService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BookQueryResolver implements GraphQLQueryResolver  {


    private final BookService bookService;

    @Autowired public BookQueryResolver(BookService bookService) { super();
        this.bookService = bookService; }


    public BookContentDTO getPosts(Long PostId) { return
            bookService.getPosts(PostId); }

    public BookContentDTO allPosts() { return bookService.allPosts(); }




}