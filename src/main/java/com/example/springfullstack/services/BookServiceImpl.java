package com.example.springfullstack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springfullstack.entities.Books;
import com.example.springfullstack.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
	
	@Override
	public List<Books> getbooks() {
		// TODO Auto-generated method stub
		return (List<Books>) bookRepository.findAll();
	}

	@Override
	public Books getbookById(Integer id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public Books createBooks(Books book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Integer id) {
		// TODO Auto-generated method stub
		 bookRepository.deleteById(id);
	}
	
	

}
