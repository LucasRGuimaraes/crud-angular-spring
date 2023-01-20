package br.com.lucas.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.lucas.crud.domain.model.Course;
import br.com.lucas.crud.domain.repository.CourseRepository;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();

			Course course = new Course();
			course.setName("Angular");
			course.setCategory("Front-end");

			courseRepository.save(course);
		};
	}

}
