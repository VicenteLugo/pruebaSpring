package edu.spring.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.spring.entity.Person;
import edu.spring.service.PersonService;

@RestController
public class HelloController {
	
	@Autowired
	private PersonService service;
	
	@Value("${name}")
	private String name; 
	
	@Value("${age:100}")
	private int age;
	
	@GetMapping("/")
	public String hello() {
		return "Bienvenido a mi mente, "+name+"\n edad "+age;  
	}
	
	@GetMapping("/person")
	public List<Person> get(){
		return this.service.read();
	}
	
	@GetMapping("/person/{name}")
	public List<Person> getNameParam(@RequestParam() String name){
		return this.service.read().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList());
	}
	
	public List<Person> save(@RequestBody Person p){
		this.service.save(p);
		return get();
	}
	
}
