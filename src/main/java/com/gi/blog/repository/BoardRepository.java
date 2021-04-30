package com.gi.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gi.blog.model.Board;


public interface BoardRepository extends JpaRepository<Board, Integer> {

	
}
