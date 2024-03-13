package com.paul.book.management.api.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String bookName;
	private String author;
}
