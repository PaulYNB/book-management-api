package com.paul.book.management.api.service;

import java.util.List;

import com.paul.book.management.api.entity.Book;

public interface IBookService {
	public void createBook(Book book);
	public List<Book> getBooks(String bookId);
	public Book getBook(String bookId);
	public List<Book> getAllBooks();
	public void updateBook(Book book);
	public void deleteBook(String bookId);
}
