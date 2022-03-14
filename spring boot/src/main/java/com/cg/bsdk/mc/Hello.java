package com.cg.bsdk.mc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}

