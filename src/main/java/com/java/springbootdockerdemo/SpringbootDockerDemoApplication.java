package com.java.springbootdockerdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springbootdockerdemo.dao.BookRepository;
import com.java.springbootdockerdemo.model.Book;


@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringbootDockerDemoApplication {
	
	@Autowired
	public BookRepository bookRep;

	@GetMapping("/welcome")
	public String welcome() {
		return "Spring Boot Docker - Welcome!";
	}
	@PostMapping	
	public Book saveBook(@RequestBody Book book) {
		return bookRep.save(book);
	}
	
	@GetMapping
	public List<Book> getBooks(){
		return bookRep.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

}
