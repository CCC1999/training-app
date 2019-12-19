package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ymz
 *
 */
@RestController
public class HelloController { 
	
	@RequestMapping("/hi")
	public String hello() {
		return "Hello nuc-a!";
	}
} 