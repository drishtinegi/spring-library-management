package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring IoC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService. Because of DI, it already has the BookRepository inside it!
        BookService libraryService = context.getBean("bookService", BookService.class);

        // Test it
        libraryService.registerBook();
    }
}