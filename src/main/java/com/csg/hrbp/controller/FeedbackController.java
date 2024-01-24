package com.csg.hrbp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csg.hrbp.entity.EmployeeMaster;
import com.csg.hrbp.entity.Feedback;
import com.csg.hrbp.service.FeedbackService;

import lombok.extern.slf4j.Slf4j;

@RestController
//@RequestMapping("")
@Slf4j
@CrossOrigin("*")
public class FeedbackController {
	
	
	@Autowired
	FeedbackService fedFeedbackService;
	
	@PostMapping("/savefeedback")
	public String saveFeedback(@RequestBody Feedback feedback) {
		log.info("saveFeedback(-)");
		return fedFeedbackService.saveFeedback(feedback);
	}
	
	

}
