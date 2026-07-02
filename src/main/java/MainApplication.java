package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        // 1. Load the XML configuration file from the classpath resources folder
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Fetch the fully configured managed bean instance out of the Spring container
        BookService libraryService = context.getBean("bookService", BookService.class);

        // 3. Test execution
        libraryService.registerBook();
    }
}