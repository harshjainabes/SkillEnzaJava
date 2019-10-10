package com.socgen.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/survey")
@CrossOrigin(origins ="*")
public class SurveyController 
{
       
    @GetMapping(path="/")
    public String getSurveys() 
    {
        return "Hello";
    }
    
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public String addSurvey(
                      
                        @RequestBody String survey) 
                 throws Exception 
    {       
     
        return "survey created";
    }
}
