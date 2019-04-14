package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class EmsSpringBootV2Application {
	
	public EmsSpringBootV2Application() {
	System.out.println("Ems SpringBoot App created....");
	}

	public static void main(String[] args) {
		SpringApplication.run(EmsSpringBootV2Application.class, args);
	}
	
	
	

	
	

}
