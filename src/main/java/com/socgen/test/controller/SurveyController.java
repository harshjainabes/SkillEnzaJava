package com.socgen.test.controller;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.test.model.Survey;
import com.socgen.test.service.SurveyService;

@RestController
@RequestMapping(path = "/survey")
@CrossOrigin(origins ="*")

public class SurveyController 
{
       
	@Autowired
	private SurveyService svc;
	
	Logger logger = Logger.getLogger(SurveyController.class.getName());
	
	
    @GetMapping(path="/getAllSurveys")
    public List<Survey> getSurveys() 
    {
    	logger.log(Level.INFO,"Created");
        return svc.getAllSurveys();
        
    }
    
    @GetMapping(path="/getSurveyById")
    public String getSurveyById() 
    {
        return "Hello";
    }
    
    @PostMapping(path= "/createSurvey", consumes = "application/json")
    public String addSurvey(
                      
                        @RequestBody Survey survey) 
                 throws Exception 
    {       
     
        return "Survey created";
    }
}
