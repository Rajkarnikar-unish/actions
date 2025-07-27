package com.unishraj.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionsApplication.class, args);
	}

	@GetMapping("/")
	public String healthChecker() {
		return "OK";
	}

}

//echo "# actions" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin git@github.com:Rajkarnikar-unish/actions.git
//git push -u origin main