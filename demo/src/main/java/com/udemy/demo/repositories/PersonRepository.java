package com.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}


