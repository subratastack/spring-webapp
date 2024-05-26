package com.subrata_education.spring_webapp.bootstrap;

import com.github.javafaker.Faker;
import com.subrata_education.spring_webapp.domain.Author;
import com.subrata_education.spring_webapp.domain.Book;
import com.subrata_education.spring_webapp.domain.Publisher;
import com.subrata_education.spring_webapp.repositories.AuthorRepository;
import com.subrata_education.spring_webapp.repositories.BookRepository;
import com.subrata_education.spring_webapp.repositories.PublisherRepository;
import org.hibernate.jpa.boot.spi.Bootstrap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private static final Faker FAKER;
    private static final int NO_OF_DATA;

    static {
        FAKER = Faker.instance(Locale.US);
        NO_OF_DATA = 5;
    }

    public BootstrapData(AuthorRepository authorRepository,
                         BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        return;
        /* for (int i = 0; i < BootstrapData.NO_OF_DATA; i++) {
            Author savedAuthor = generateAndAddAuthor();
            Book savedBook = generateAndAddBook();
            Publisher savedPublisher = generateAndAddPublisher();

            savedAuthor.getBooks().add(savedBook);
            savedBook.getAuthors().add(savedAuthor);
            authorRepository.save(savedAuthor);

            savedBook.setPublisher(savedPublisher);
            bookRepository.save(savedBook);
        }

        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count()); */
    }

    private Author generateAndAddAuthor() {
        Author author = new Author();
        author.setFirstName(BootstrapData.FAKER.name().firstName());
        author.setLastNme(BootstrapData.FAKER.name().lastName());
        return authorRepository.save(author);
    }

    private Book generateAndAddBook() {
        Book book = new Book();
        book.setTitle(BootstrapData.FAKER.book().title());
        book.setIsbn(String.valueOf(BootstrapData.FAKER.number().numberBetween(1000, 4000)));
        return bookRepository.save(book);
    }

    private Publisher generateAndAddPublisher() {
        Publisher publisher = new Publisher();
        publisher.setPublisherName(BootstrapData.FAKER.book().publisher());
        publisher.setAddress(BootstrapData.FAKER.address().streetAddress());
        publisher.setCity(BootstrapData.FAKER.address().city());
        publisher.setState(BootstrapData.FAKER.address().state());
        publisher.setZip(BootstrapData.FAKER.address().zipCode());

        return publisherRepository.save(publisher);
    }
}
