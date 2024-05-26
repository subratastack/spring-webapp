package com.subrata_education.spring_webapp.services;

import com.subrata_education.spring_webapp.domain.Book;

public interface BookServices {

    Iterable<Book> findAll();
}
