package com.sprojects.rest.webservices.restfulwebservices.todo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {
	
	Page<Todo> findByUsername(String username, Pageable pageable);
	
}
