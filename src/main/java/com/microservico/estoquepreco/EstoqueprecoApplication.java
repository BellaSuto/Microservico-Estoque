package com.microservico.estoquepreco;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class EstoqueprecoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoqueprecoApplication.class, args);
	}

}
