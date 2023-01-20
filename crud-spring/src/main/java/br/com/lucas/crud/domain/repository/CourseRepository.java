package br.com.lucas.crud.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.crud.domain.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> { }
