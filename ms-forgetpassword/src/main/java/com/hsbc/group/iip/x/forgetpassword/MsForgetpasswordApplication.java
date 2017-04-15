package com.hsbc.group.iip.x.forgetpassword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hsbc.group.iip")
public class MsForgetpasswordApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsForgetpasswordApplication.class, args);
	}
}
