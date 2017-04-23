package com.hsbc.group.iip.x.leave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hsbc.group.iip")
public class MsLeaveapplyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLeaveapplyApplication.class, args);
	}
}
