package com.playground.springhibernate.controllers;

import com.playground.springhibernate.entities.Book;
import com.playground.springhibernate.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController /* @Controller & @ResponseBody */
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping(value = "")
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping(value = "/{isbn}")
    public Book getBook(@PathVariable String isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }
}
