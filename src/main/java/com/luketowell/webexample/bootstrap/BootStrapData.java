package com.luketowell.webexample.bootstrap;

import com.luketowell.webexample.model.Author;
import com.luketowell.webexample.model.Book;
import com.luketowell.webexample.model.Publisher;
import com.luketowell.webexample.repositories.AuthorRepository;
import com.luketowell.webexample.repositories.BookRepository;
import com.luketowell.webexample.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "132412424535");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEDJ = new Book("J2EE Development without EJB", "131142542334");

        rod.getBooks().add(noEDJ);
        noEDJ.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEDJ);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());

        Publisher towellPublisher = new Publisher("Towell Publishers", "Embleton Road", "Leeds", "West Yorkshire", "LS26 9DA");

        publisherRepository.save(towellPublisher);

        System.out.println("publishers count: " + publisherRepository.count());

    }
}
