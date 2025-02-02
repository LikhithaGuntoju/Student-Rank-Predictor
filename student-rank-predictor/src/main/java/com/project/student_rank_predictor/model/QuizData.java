package com.project.student_rank_predictor.model;

import java.util.List;

import lombok.Data;

@Data
public class QuizData {
	private int userId;
	private int totalScore;
	private List<Question> questions;
	
	public int getTotalScore() {
		return totalScore;
	}
}

