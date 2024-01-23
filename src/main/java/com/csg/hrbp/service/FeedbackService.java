package com.csg.hrbp.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csg.hrbp.entity.Feedback;
import com.csg.hrbp.repo.FeedbackRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FeedbackService {

	@Autowired
	public FeedbackRepo feedbackrepo;

	public String saveFeedback(Feedback feedback) {
		feedback.setCreatedDate(getDateTime());
		feedback.setTicketDetails("Testing ticket created");

		log.info("saveFeedback(-)");
		feedbackrepo.save(feedback);

		return "Ticket :" + feedback.getTicketId() + " saved successfully";
	}

	public static String getDateTime() {
		LocalDateTime currentDateTime = LocalDateTime.now();
		String usDateFormatPattern = "yyyy-MM-dd hh:mm:ss a";
		DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern(usDateFormatPattern);
		String formattedDate = currentDateTime.format(usDateFormat);

		return formattedDate;
	}

}
