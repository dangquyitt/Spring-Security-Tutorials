package com.junior;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.Serializable;

@SpringBootApplication
public class SpringSecurityTutorialsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTutorialsApplication.class, args);
	}

}
