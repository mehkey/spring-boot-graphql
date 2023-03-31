package com.mehkey.graphql;

import com.mehkey.graphql.model.Author;
import com.mehkey.graphql.model.Book;
import com.mehkey.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) { super();
        this.bookService = bookService;
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        //
        //return Book.getById(id);
        return this.bookService.getBooks(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return null;//Author.getById(book.getAuthorId());
    }
}
