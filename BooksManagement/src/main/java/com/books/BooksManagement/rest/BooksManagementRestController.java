package com.books.BooksManagement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.BooksManagement.dao.BookManagementRepository;
import com.books.BooksManagement.entity.Book;

@RestController
@RequestMapping("/")
public class BooksManagementRestController {
	
	@Autowired
	private BookManagementRepository mBookManagementRepository;

	@GetMapping("/")
	public List<Book> returnAll(){
		return mBookManagementRepository.findAll();
	}
	
}
