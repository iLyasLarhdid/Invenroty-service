package com.larhdid.security;

import com.larhdid.security.entities.Customer;
import com.larhdid.security.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("ilyas").email("ilyas@test.com").build());
			customerRepository.save(Customer.builder().name("said").email("said@test.com").build());
			customerRepository.save(Customer.builder().name("taha").email("taha@test.com").build());
			customerRepository.save(Customer.builder().name("wissal").email("wissal@test.com").build());
		};
	}

}
