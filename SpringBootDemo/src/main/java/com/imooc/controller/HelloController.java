package com.imooc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${person.name}")
	private String name;
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String say(){
		return this.name+"10";
	}

}
