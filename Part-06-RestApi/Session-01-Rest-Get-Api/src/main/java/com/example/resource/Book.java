package com.example.resource;


public class Book {
private String author;
private Integer price;
private String name; 
public Book() {
	// TODO Auto-generated constructor stub
}
public Book(String author, Integer price, String name) {
	super();
	this.author = author;
	this.price = price;
	this.name = name;
}
@Override
public String toString() {
	return "Book [author=" + author + ", price=" + price + ", name=" + name + "]";
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
