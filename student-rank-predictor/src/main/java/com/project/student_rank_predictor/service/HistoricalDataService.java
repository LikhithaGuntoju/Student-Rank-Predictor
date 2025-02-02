package com.project.student_rank_predictor.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.student_rank_predictor.model.HistoricalQuiz;

@Service
public class HistoricalDataService {
	private static final String HISTORY_API_URL ="https://api.jsonserve.com/XgAgFJ";
	
	public List<HistoricalQuiz>  fetchPastQuizData(int userId) {
		RestTemplate restTemplate = new RestTemplate();
		HistoricalQuiz[] response = restTemplate.getForObject(HISTORY_API_URL + "?userId" + userId, HistoricalQuiz[].class);
		return Arrays.asList(response); // Convert array to List
		}
}
