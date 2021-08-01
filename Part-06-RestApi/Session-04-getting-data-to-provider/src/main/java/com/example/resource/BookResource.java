package com.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Book;

@RestController
@RequestMapping("book")
public class BookResource {

	@GetMapping("name")
	public String getInfoByBooName(@RequestParam(value = "n", required = false) String bookName) {

		return "You book is java development you can read" + bookName;
	}

	/// book/author/prashant
	@GetMapping("author/{author}")
	public String getInfoByAuthor(@PathVariable("author") String author) {

		return "nice book of " + author;
	}

	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		return book;
	}

}
