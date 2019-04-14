package com.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping("/hello")
@Controller
public class HelloController {

	
	public HelloController() {
	System.out.println("HelloController created...");
	}


	@ApiResponses(value= {@ApiResponse(code=500,message="Internal Server error",response=String.class)})
	@ApiOperation("returns a 'Hello World!!!!' message")
	@RequestMapping
	public  @ResponseBody String hello() {
		return "Hello World!!!!";
	}
	
   	
	
	
	@ApiResponses(value= {@ApiResponse(code=500,message="Internal Server error",response=String.class)})
	
	@ApiOperation("returns a Current Date ")
	@RequestMapping(value="/today",method=RequestMethod.GET)
	public  String today(ModelMap map) {
		map.addAttribute("today", new Date());
   		return "today";
	}

   	
	
}
