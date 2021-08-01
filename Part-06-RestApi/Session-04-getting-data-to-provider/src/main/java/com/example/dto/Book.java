package com.example.dto;


public class Book {
	
	private String bookName;
	private String author;
	private Integer price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String author, Integer price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	

}
