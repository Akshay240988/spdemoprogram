package com.spfirstprogram.spdemoprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpdemoprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpdemoprogramApplication.class, args);
	}

//	@GetMapping("/check")      //endpoint
//	public String getData(){ return "Hello Spring";}
//
//	@GetMapping("/add/{value1}/{value2}")
//	public int addNos(@PathVariable int value1,@PathVariable int value2){
//		return value1+value2;
//	}
}
