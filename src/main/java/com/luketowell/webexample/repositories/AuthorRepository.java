package com.luketowell.webexample.repositories;

import com.luketowell.webexample.model.Author;
import org.springframework.data.repository.CrudRepository;

public class AuthorRepository extends CrudRepository<Author, Long> {
}
