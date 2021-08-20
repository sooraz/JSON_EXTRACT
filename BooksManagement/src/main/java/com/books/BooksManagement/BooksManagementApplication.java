package com.books.BooksManagement;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.books.BooksManagement.entity.Book;

import com.books.BooksManagement.dao.BookManagementRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class BooksManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksManagementApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(BookManagementRepository booksRepo) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Book>> typeReference = new TypeReference<List<Book>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/books8f8fe52.json");
			try {
				if(inputStream != null && typeReference !=null) {
				List<Book> books = mapper.readValue(inputStream,typeReference);
				if(books != null)
					booksRepo.saveAll(books);
				}
			} catch (IOException e){
				System.out.println("Unable to save books to db: " + e.getMessage());
			}
		};
	}
}
