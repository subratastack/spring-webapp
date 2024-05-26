package com.subrata_education.spring_webapp.services;

import com.subrata_education.spring_webapp.domain.Book;
import com.subrata_education.spring_webapp.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BookServicesImpl implements BookServices {

    private static final Logger log = LoggerFactory.getLogger(BookServicesImpl.class);
    private final BookRepository bookRepository;

    public BookServicesImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
