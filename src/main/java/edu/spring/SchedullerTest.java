package edu.spring;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedullerTest {
	
	@Scheduled(cron = "* * * * * *")
	public void test() {
		System.out.println("Verificando la base de datos...."); 
	}
	
}
