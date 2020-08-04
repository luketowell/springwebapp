package com.luketowell.webexample.repositories;

import com.luketowell.webexample.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
