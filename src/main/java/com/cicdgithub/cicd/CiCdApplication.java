package com.cicdgithub.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdApplication {

	@GetMapping("/Welcome")
	public String welcome(){
		return "Welcome to Apurv";
	}

//	echo "# pipeline" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/progeek29/pipeline.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(CiCdApplication.class, args);
	}

}
