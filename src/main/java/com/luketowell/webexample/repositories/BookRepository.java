package com.luketowell.webexample.repositories;

import com.luketowell.webexample.model.Book;
import org.springframework.data.repository.CrudRepository;

public class BookRepository extends CrudRepository<Book, Long> {
}
