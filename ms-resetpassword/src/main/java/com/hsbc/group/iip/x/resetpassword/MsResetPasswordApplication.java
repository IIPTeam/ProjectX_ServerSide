package com.hsbc.group.iip.x.resetpassword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.hsbc.group.iip")
@SpringBootApplication
public class MsResetPasswordApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsResetPasswordApplication.class, args);
	}
}
