package com.theo.bookstore.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theo.bookstore.domain.Livro;

@Repository
public interface Livros extends JpaRepository<Livro, Integer> {

}
