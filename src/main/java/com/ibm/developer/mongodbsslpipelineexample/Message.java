package com.ibm.developer.mongodbsslpipelineexample;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Message implements Serializable {

	private static final long serialVersionUID = 4718150599132848856L;
	private String message;
	@Id
	private Long id;

	public Message(String message, Long id) {
		super();
		this.message = message;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + ", id=" + id + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}