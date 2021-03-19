package edu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.entity.Person;
import edu.spring.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	public Person save(final Person p) {
		return this.repository.save(p); 
	}
	
	public List<Person> read(){
		return this.repository.findAll();
	}
	
	public List<Person> readByName(final String name){
		return  this.repository.findAllByName(name);
	}
}
