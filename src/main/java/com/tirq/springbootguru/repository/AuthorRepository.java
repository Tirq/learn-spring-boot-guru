package com.tirq.springbootguru.repository;


import com.tirq.springbootguru.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
