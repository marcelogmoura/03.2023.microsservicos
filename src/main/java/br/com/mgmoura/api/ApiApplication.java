package br.com.mgmoura.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mgmoura.api.domain.User;
import br.com.mgmoura.api.repositories.UserRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "Marcelo", "mgmoura@gmail.com", "123", 20.0),
				new User(null, "Moura", "moura@gmail.com", "678", 40.0)
				));
	}

}
