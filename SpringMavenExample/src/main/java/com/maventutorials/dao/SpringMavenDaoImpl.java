/**
 * 
 */
package com.maventutorials.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 319869
 * 
 */
@Repository
@RequestMapping("/springmaven")
public class SpringMavenDaoImpl implements SpringMavenDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.maventutorials.dao.SpringMavenDao#changeInput(java.lang.String)
	 */
	public String changeInput(final String inputText) {
		final String response = "Hello " + inputText + "!";
		return response;
	}

}
