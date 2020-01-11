package chucknorrisjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@SpringBootApplication//(scanBasePackages = {"guru.springframework", "com.example"})
public class ChuckNorrisJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokesAppApplication.class, args);
	}
	
	@Bean
	public ChuckNorrisQuotes getChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

}
