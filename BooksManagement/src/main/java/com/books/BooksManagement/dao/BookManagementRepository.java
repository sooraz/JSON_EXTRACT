package com.books.BooksManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.BooksManagement.entity.Book;

public interface BookManagementRepository extends JpaRepository<Book, Integer> {

}
