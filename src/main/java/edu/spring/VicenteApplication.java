package edu.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VicenteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VicenteApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Todo esta perfecto");
	}

}
