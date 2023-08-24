package com.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.demo.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {}
