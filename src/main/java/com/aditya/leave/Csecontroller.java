package com.aditya.leave;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {

	@GetMapping("/csehome")
	public String rocks() {
		return "THIS IS AUTOMATION JENKINS OPEN SHIFT KUBERNETES DEPLOYMENT";
	}
}