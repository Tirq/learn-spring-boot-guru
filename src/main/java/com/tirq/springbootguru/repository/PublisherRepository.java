package com.tirq.springbootguru.repository;


import com.tirq.springbootguru.model.Book;
import com.tirq.springbootguru.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
