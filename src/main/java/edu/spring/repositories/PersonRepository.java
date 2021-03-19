package edu.spring.repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.spring.entity.Person;

public interface  PersonRepository extends MongoRepository<Person, String>{
	List <Person> findAllByName(final String name); 
}
