package com.github.ecominds.webapp.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonRestController {
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}