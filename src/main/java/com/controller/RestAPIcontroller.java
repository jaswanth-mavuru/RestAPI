package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.RestAPImodel;
import com.service.RestAPIservice;

@RestController
@RequestMapping("/end")
public class RestAPIcontroller {
	
	@Autowired
	RestAPIservice restAPIservice;
	
	@PostMapping("/insert")
	public String insert(@RequestBody RestAPImodel restAPImodel)
	{
		restAPIservice.insert(restAPImodel);
		return "Inserted";
	}
	
	
	@GetMapping("/fetch")
	public List fetch()
	{
		return restAPIservice.fetch();
	}

}
