package com.example.springfullstack.entitiesImpl;

import com.example.springfullstack.entities.GreetingInterface;

public class Greeting implements GreetingInterface {

	    private final long id;
	    private final String content;
	    
	    public Greeting(long id, String content) {
	        this.id = id;
	        this.content = content;
	    }

	
	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}

}
