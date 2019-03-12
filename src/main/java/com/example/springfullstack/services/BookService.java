package com.example.springfullstack.services;


import java.util.List;

import com.example.springfullstack.entities.Books;

public interface BookService {
	public List<Books> getbooks();
	public Books getbookById(Integer id);
	public Books createBooks(Books books);
	public void deleteBookById(Integer id);

}
