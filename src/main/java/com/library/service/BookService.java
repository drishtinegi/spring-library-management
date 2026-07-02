package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Spring will use this setter method to inject the BookRepository bean
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void registerBook() {
        System.out.println("Processing book registration rules inside BookService...");
        bookRepository.saveData();
    }
}