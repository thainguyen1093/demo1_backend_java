package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${backend.rest.version:x}")
	private String version;

	@Value("${buildNumber:x}")
	private String buildNumber;

	private static final String template = "Hello, %s!";

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		Greeting greeting = new Greeting();
		greeting.setMessage(String.format(template, name));
		greeting.setVersion(version);
		greeting.setBuildNumber(buildNumber);
		return greeting;
	}
}
