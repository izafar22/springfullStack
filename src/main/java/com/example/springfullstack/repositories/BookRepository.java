package com.example.springfullstack.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.springfullstack.entities.Books;

public interface BookRepository extends CrudRepository<Books, Integer> {

}
