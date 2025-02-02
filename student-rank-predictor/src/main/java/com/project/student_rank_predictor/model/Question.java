package com.project.student_rank_predictor.model;

import lombok.Data;

@Data
public class Question {
	private int questionId;
	private String topic;
	private int difficulty;
	private int selectedOption;
}
