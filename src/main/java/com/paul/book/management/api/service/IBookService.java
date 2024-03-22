package com.paul.book.management.api.service;

import java.util.List;

import org.springframework.dao.DuplicateKeyException;

import com.paul.book.management.api.entity.Book;

public interface IBookService {
	public int createBook(Book book) throws DuplicateKeyException;
	public List<Book> getBooks(String bookId);
	public Book getBook(String bookId);
	public List<Book> getAllBooks();
	public int updateBook(Book book);
	public int deleteBook(String bookId);
}
