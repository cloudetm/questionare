package oopsz.intx.dao;


import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import com.intx.domain.Question;
import oopsz.intx.dao.DBUtility;


public class QuestionService {
	
	 private Connection connection;

	 public QuestionService() {
	  connection = DBUtility.getConnection();
	 }
 
	 public List<Question> getAllQuestions() {
	  List<Question> questions = new ArrayList<Question>();
	  try {
		   Statement statement = connection.createStatement();
		   ResultSet rs = statement.executeQuery("select * from tblQuestions");
		   while (rs.next()) {
			   Question question = new Question();
			   question.setQuestion(rs.getString("question"));
			   PreparedStatement preparedStatement = connection.
					     prepareStatement("select * from tblOptions where questionid=?");
			   preparedStatement.setInt(1, rs.getInt("questionid"));
			   ResultSet prs = preparedStatement.executeQuery();
			   while (prs.next()) {
				   question.addChoice(prs.getString("option_string"), prs.getBoolean("correct_option"));
			   }
			   questions.add(question);
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
	  return questions;
	 }
 
}
