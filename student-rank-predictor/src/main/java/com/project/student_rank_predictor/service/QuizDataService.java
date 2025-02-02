package com.project.student_rank_predictor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.student_rank_predictor.model.QuizData;

@Service
public class QuizDataService {
	private static final String QUIZ_API_URL ="https://api.jsonserve.com/rJvd7g";
	
	public QuizData fetchCurrentQuizData(int userId) {
		//RestTemplate is a class in Spring Boot used to make HTTP requests to external APIs. 
		//In the selected code (QuizDataService.java), RestTemplate is used to fetch quiz data from an external API.
		RestTemplate restTemplate = new RestTemplate();
		//RestTemplate Instance:Creates an instance of RestTemplate to send HTTP requests.
		return restTemplate.getForObject(QUIZ_API_URL + "?userId=" + userId, QuizData.class);
		//Fetching Data from API: getForObject(URL, Class<T>) sends a GET request to the provided URL and converts the response into the specified Java object (QuizData).
		
		//Why Use RestTemplate?
//		Makes it easy to send HTTP requests in Spring Boot.
//		Converts JSON responses into Java objects automatically.
//		Useful when integrating with external APIs.
//		Spring Boot now recommends using WebClient instead of RestTemplate for reactive applications, but RestTemplate is still widely used for simple API calls.
	}
}
