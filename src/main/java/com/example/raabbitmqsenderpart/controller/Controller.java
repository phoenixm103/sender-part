package com.example.raabbitmqsenderpart.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.raabbitmqsenderpart.service.RabbitMQSender;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class Controller {
	
	@Autowired
	RabbitMQSender rabbitMQSender;
 
	@PostMapping(value = "/producer")
	public String producer(@RequestParam(value="message") String message) throws IOException { 
 
		rabbitMQSender.send(message);
		return "Message sent to the RabbitMQ Successfully";
	}
	@GetMapping(value = "/test")
	public String hello() { 
 
		
		return "tested";
	}
	
}