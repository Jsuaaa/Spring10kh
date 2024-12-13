package com.example.login_register;

import org.springframework.boot.SpringApplication;

public class TestLoginRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.from(LoginRegisterApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
