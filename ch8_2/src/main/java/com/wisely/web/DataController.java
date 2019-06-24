package com.wisely.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.dao.PersonRepository;

@RestController
public class DataController {

	@Autowired
	PersonRepository personRepository;
	
	
}
