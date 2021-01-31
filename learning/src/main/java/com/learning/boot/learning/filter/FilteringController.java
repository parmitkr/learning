package com.learning.boot.learning.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping(path="/filterbean")
	public SomeBean retriveSomeBean() {
		return new SomeBean("value1", "value2", "value3");
	}

}
