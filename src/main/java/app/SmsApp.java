package app;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.entity.Student;
import app.repository.StudentRepository;

@SpringBootApplication
public class SmsApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApp.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}