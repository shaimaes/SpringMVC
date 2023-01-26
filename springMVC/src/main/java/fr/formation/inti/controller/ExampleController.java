package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ExampleController {
	
	@GetMapping("/sample")
	public String showForm() {
		return "sample";
	}
}
