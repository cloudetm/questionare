package com.intx.domain;
import java.util.*;

public class Question {
	
	private String question;
	private Map<String, Boolean> options = new HashMap<String, Boolean>();
	private String correctAnswer;

	public String getQuestion(){
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	 }
	
	public void addOption(String opt, Boolean correct_answer){
		options.put(opt, correct_answer);
		if (correct_answer)
			this.correctAnswer = opt;
	}
	
	public String getCorrectAnswer(){
		return this.correctAnswer;
	}
	
	public Set<String> getOptions(){
		return options.keySet();
	}
	
	@Override
	public String toString() {
	return "Question [question=" + question + "]";
	}   

}
