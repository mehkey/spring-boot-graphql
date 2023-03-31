package com.mehkey.graphql.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.mehkey.graphql.model.BookContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

//import com.mehkey.graphql.dto.CreateBookDTO;

//import com.mehkey.graphql.exception.ResourceNotFoundException;
import com.mehkey.graphql.model.Book;
import com.mehkey.graphql.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBooks(String BookId) {
        BookContent bookContentDto = new BookContent();
        Optional<Book> book = bookRepository.findById(BookId);
        if (!book.isPresent()) {
            throw new RuntimeException("Unable to find book with given book id :" + BookId);
        }

        return book.get();
        /*BookDTO bookDto = this.modelMapper.map(book.get(), BookDTO.class);
        List<BookDTO> objects = Collections.singletonList(bookDto);

        //bookContentDto.setStatusCode(HttpStatus.FOUND.value());
        //bookContentDto.setTotalRecord(1);
        bookContentDto.setBookList(objects);

        return bookContentDto;*/
    }

    public BookContent allBooks() {
        BookContent bookContentDto = new BookContent();
        List<Book> book = bookRepository.findAll();

        List<Book> objectList = new ArrayList<>();

        book.stream().forEach(bookObj -> objectList.add(bookObj));

        //bookContentDto.setStatusCode(HttpStatus.FOUND.value());
        //bookContentDto.setTotalRecord(book.size());
        bookContentDto.setBookList(objectList);

        return bookContentDto;
    }
}
