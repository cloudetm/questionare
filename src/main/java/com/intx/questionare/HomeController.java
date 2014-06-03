package com.intx.questionare;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import oopsz.intx.dao.QuestionService;
import com.intx.domain.Question;


@Controller
public class HomeController {
	
	QuestionService questionareService=new QuestionService();
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String home() {
		return "redirect:resources/pages/index.html";
	}
	
	@RequestMapping(value="questions", method=RequestMethod.GET, headers="Accept=application/json")
    @ResponseBody
    public List<Question> getAllQuestions() {
		List<Question> questions=questionareService.getAllQuestions();
        return questions;
    }
	
}
