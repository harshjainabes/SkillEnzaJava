/**
 * 
 */
package com.socgen.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.socgen.test.model.Survey;
import com.socgen.test.service.SurveyService;

/**
 * @author Harsh Jain
 *
 * 
 */
@Service
public class SurveyServiceImpl implements SurveyService {

	@Override
	public List<Survey> getAllSurveys() {
		List<Survey> l=new ArrayList<Survey>();
		return l;
	}
	


	

}
