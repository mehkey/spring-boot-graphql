package com.mehkey.graphql.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

//import com.mehkey.graphql.dto.CreateBookDTO;
import com.mehkey.graphql.DTO.BookContentDTO;
import com.mehkey.graphql.DTO.BookDTO;
//import com.mehkey.graphql.exception.ResourceNotFoundException;
import com.mehkey.graphql.model.Book;
import com.mehkey.graphql.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;
    private ModelMapper modelMapper;

    @Autowired
    public BookService(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }

    public BookContentDTO getBooks(Long BookId) {
        BookContentDTO bookContentDto = new BookContentDTO();
        Optional<Book> book = bookRepository.findById(BookId);
        if (!book.isPresent()) {
            throw new RuntimeException("Unable to find book with given book id :" + BookId);
        }

        BookDTO bookDto = this.modelMapper.map(book.get(), BookDTO.class);
        List<BookDTO> objects = Collections.singletonList(bookDto);

        //bookContentDto.setStatusCode(HttpStatus.FOUND.value());
        //bookContentDto.setTotalRecord(1);
        bookContentDto.setBookList(objects);

        return bookContentDto;
    }

    public BookContentDTO allBooks() {
        BookContentDTO bookContentDto = new BookContentDTO();
        List<Book> book = bookRepository.findAll();

        List<BookDTO> objectList = new ArrayList<>();
        book.stream().forEach(bookObj -> objectList.add(this.modelMapper.map(bookObj, BookDTO.class)));

        //bookContentDto.setStatusCode(HttpStatus.FOUND.value());
        //bookContentDto.setTotalRecord(book.size());
        bookContentDto.setBookList(objectList);

        return bookContentDto;
    }
}
