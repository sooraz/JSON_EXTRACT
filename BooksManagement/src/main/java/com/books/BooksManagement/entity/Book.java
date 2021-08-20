package com.books.BooksManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

//	"bookID": 1,
//    "title": "Harry Potter and the Half-Blood Prince (Harry Potter  #6)",
//    "authors": "J.K. Rowling-Mary GrandPré",
//    "average_rating": 4.56,
//    "isbn": 439785960,
//    "language_code": "eng",
//    "ratings_count": 1944099,
//    "price": 230
	@Id
    @Column(name = "id")
    private int bookID;
	@Column(name = "title")
    private String title;
	@Column(name = "author")
    private String authors;
	@Column(name = "average_rating")
    private double average_rating;
	@Column(name = "isbn")
    private Object isbn;
	@Column(name = "language_code")
    private String language_code;
	@Column(name = "ratings_count")
    private double ratings_count;
	@Column(name = "price")
    private int price;
	
	public Book() {}

	public Book(int bookID, String title, String authors, double average_rating, Object isbn, String language_code,
			double ratings_count, int price) {
		this.bookID = bookID;
		this.title = title;
		this.authors = authors;
		this.average_rating = average_rating;
		this.isbn = isbn.toString();
		this.language_code = language_code;
		this.ratings_count = ratings_count;
		this.price = price;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public double getAverage_rating() {
		return average_rating;
	}

	public void setAverage_rating(double average_rating) {
		this.average_rating = average_rating;
	}

	public Object getIsbn() {
		return isbn;
	}

	public void setIsbn(Object isbn) {
		this.isbn = isbn;
	}

	public String getLanguage_code() {
		return language_code;
	}

	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}

	public double getRatings_count() {
		return ratings_count;
	}

	public void setRatings_count(double ratings_count) {
		this.ratings_count = ratings_count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", authors=" + authors + ", average_rating="
				+ average_rating + ", isbn=" + isbn + ", language_code=" + language_code + ", ratings_count=" + ratings_count
				+ ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
}


