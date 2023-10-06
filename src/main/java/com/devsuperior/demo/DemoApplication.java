package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/*
	 * @Autowired private PasswordEncoder passwordEncoder;
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println("CRIPTOGRAFADO:" + passwordEncoder.encode("123456")); }
	 */

}
