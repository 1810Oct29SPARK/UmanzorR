package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.revature.beans.Bear;
import com.revature.service.BearService;

@Controller
@RequestMapping(value="/bear")
public class BearController {
	
	@Autowired
	private BearService bearService;
	
	@RequestMapping(value="/bears", method=RequestMethod.GET)
	@ResponseBody //returns just data
	public ResponseEntity<List<Bear>> getAllBears() {
		return new ResponseEntity<>(bearService.allBears(), HttpStatus.OK);
	}


	@GetMapping(value="/{id}")
	public ResponseEntity<Bear> getBearById(@PathVariable int id) {
		Bear b = bearService.getBearById(id);
		if (b == null)
			return new ResponseEntity<>("this us not the bear you're looking for", HttpStatus.BAD_REQUEST);
}

}