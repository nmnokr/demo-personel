package com.example.demo.personel;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

@EnableSwagger2
public class Application {

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		SpringApplication.run(Application.class, args);
	}

	// 
}
