package pl.sopello.softwarecraftmanship.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsdemoApplication {

	public static void main(String[] args) {
		System.out.println("Startup test!");
		SpringApplication.run(AwsdemoApplication.class, args);
	}
}
