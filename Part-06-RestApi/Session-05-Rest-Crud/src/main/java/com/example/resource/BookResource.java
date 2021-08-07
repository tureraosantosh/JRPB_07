package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.service.BookService;

@RestController
@RequestMapping("/book")
public class BookResource {
	
	@Autowired
	private  BookService bookService;

	@PostMapping
	public Book saveBook(@RequestBody Book book)
	{
		Book saveBook = bookService.saveBook(book);
		return saveBook;
	}

}
