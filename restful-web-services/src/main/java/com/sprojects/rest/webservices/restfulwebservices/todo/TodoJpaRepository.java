package com.sprojects.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>, PagingAndSortingRepository<Todo, Long> {
	
	Page<Todo> findByUsername(String username, Pageable pageable);
	
}
