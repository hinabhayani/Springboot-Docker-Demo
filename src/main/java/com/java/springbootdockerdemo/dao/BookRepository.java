package com.java.springbootdockerdemo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.springbootdockerdemo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
