package com.RDS.skilltree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SkillTreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillTreeApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "welcome to skill tree backend";
	}
}
