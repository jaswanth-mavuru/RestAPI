package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.RestAPImodel;
import com.repository.RestAPIrepo;

@Service
public class RestAPIservice {
	
	@Autowired
	RestAPIrepo restAPIrepo;

	public void insert(RestAPImodel restAPImodel) {
		restAPIrepo.save(restAPImodel);	
	}

	public List fetch() {
		return restAPIrepo.findAll();
		
	}

}
