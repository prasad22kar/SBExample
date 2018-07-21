/**
 * 
 */
package com.maventutorials.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maventutorials.dao.SpringMavenDao;

/**
 * @author 319869
 * 
 */
@Service
@RequestMapping("/springmaven")
public class SpringMavenServiceImpl implements SpringMavenService {

	@Autowired
	private SpringMavenDao springMavenDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.maventutorials.service.SpringMavenService#changeInputService(java
	 * .lang.String)
	 */
	public String changeInputService(final String inputTxt) {
		return springMavenDao.changeInput(inputTxt);
	}

}
