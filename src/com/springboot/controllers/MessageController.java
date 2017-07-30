package com.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@RequestMapping(path="/message",produces="text/plain")
	public String getMessage()
	{
		return "Congratulations !! Your have built your first Spring Boot App.";
	}

}
