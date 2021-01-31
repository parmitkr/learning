package com.learning.boot.learning.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//getMapping
	//seturl
	@GetMapping(path="/hello")
	public String sayHello() {
		
		return "Hello Boot";
	}
	
	@GetMapping(path="/hello-bean")
	public HelloWorldBean sayHelloBean() {
		
		return new HelloWorldBean("Hello Bean");
	}
	
	@GetMapping(path="/hello-name/{pName}")
	public HelloWorldBean sayHelloTo(@PathVariable String pName) {
		return new HelloWorldBean(String.format("Hello Mr %s", pName));
	}

}
