package oopsz.intx.dao;


import java.util.ArrayList;
import java.util.List;

import com.intx.domain.Question;


public class QuestionService {
 
 public List<Question> getAllQuestions() {
  List<Question> questions = new ArrayList<Question>();
  Question q = new Question();
  q.setQuestion("Question 1");
  q.addOption("Option 1", true);
  q.addOption("Option 2", false);
  q.addOption("Option 3", false);
  q.addOption("Option 4", false);
  questions.add(q);
  q.setQuestion("Question 2");
  q.addOption("Option 1", false);
  q.addOption("Option 2", false);
  q.addOption("Option 3", true);
  q.addOption("Option 4", false);
  questions.add(q);
  return questions;
 }
 
}
