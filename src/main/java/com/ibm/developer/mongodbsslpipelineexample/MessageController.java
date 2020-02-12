package com.ibm.developer.mongodbsslpipelineexample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	private MessageRepository repo;

	public MessageController(MessageRepository repo) {
		super();
		this.repo = repo;
	}

	@GetMapping(value = "send/{msg}")
	public void send(@PathVariable String msg) throws Exception {
		repo.save(new Message(msg, 1L));
	}
	
	
	@GetMapping("received")
	public List<Message> received(){
		return repo.findAll();
	}
 }