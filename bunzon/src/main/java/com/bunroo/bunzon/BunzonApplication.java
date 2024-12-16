package com.bunroo.bunzon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BunzonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BunzonApplication.class, args);
	}

}
