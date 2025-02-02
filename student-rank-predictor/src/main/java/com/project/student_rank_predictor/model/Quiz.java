package com.project.student_rank_predictor.model;

import lombok.Data;

@Data
public class Quiz {
	private int quizId;
	private int score;
	
	public int getScore() {
		return score;
	}

}
