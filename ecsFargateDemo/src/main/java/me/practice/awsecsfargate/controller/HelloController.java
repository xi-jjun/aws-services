package me.practice.awsecsfargate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/{name}")
	public String greeting(@PathVariable String name) {
		return "Hello " + name + "!! This is aws ECS fargate!";
	}
}
