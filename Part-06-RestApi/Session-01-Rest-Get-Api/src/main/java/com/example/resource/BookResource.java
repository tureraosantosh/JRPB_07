package com.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {

	//api expose
	@GetMapping("/bookname")
	public String getBookName() {
		return "3 Idiots"; //ViewNmae
	}
	
	@GetMapping("/book")
	public Book getBook()
	{
		Book book=new Book("Chetan Bhagat", 260, " 3 Idiots");
		
		return book;
	}
	
	
}
