package com.project.student_rank_predictor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.student_rank_predictor.model.HistoricalQuiz;
import com.project.student_rank_predictor.model.QuizData;
import com.project.student_rank_predictor.service.HistoricalDataService;
import com.project.student_rank_predictor.service.QuizDataService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")//Allows frontend to call backend
public class RankController {
	@Autowired
	private QuizDataService quizDataService;
	@Autowired
	private HistoricalDataService historicalDataService;
	
	
	 @GetMapping("/predict-rank")
	    public int predictRank(@RequestParam int userId) {
		 
		 
	        QuizData latestQuiz = quizDataService.fetchCurrentQuizData(userId);
	        List<HistoricalQuiz> pastQuizzes = historicalDataService.fetchPastQuizData(userId);

	
	        
	        double avgScore = pastQuizzes.stream()
	        		.mapToInt(HistoricalQuiz::getScore)
	        		.average()
	        		.orElse(0);
	        
	        double improvementFactor = latestQuiz.getTotalScore() - avgScore;
	        int predictedRank = (int) (1000000 - (improvementFactor * 500));
	        return Math.max(predictedRank, 1); // Rank cannot be negative
	        
	}
}
