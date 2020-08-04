package com.luketowell.webexample.repositories;

import com.luketowell.webexample.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
