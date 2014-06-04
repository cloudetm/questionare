package com.intx.domain;
import java.util.*;

public class Question {
	
	private String question;
	private Map<String, Boolean> choice = new HashMap<String, Boolean>();
	private String answer;

	public String getQuestion(){
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	 }
	
	public void addChoice(String opt, Boolean correct_answer){
		choice.put(opt, correct_answer);
		if (correct_answer)
			this.answer = opt;
	}
	
	public String getAnswer(){
		return this.answer;
	}
	
	public Set<String> getChoice(){
		return choice.keySet();
	}
	
	@Override
	public String toString() {
	return "Question [question=" + question + "]";
	}   

}
