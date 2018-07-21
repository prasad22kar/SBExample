/**
 * 
 */
package com.maventutorials.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maventutorials.service.SpringMavenService;

/**
 * @author 319869
 * 
 */
@Controller
@RequestMapping("/springmaven")
public class SpringMavenController {

	@Autowired
	private SpringMavenService springMavenService;

	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String displayHome() {
		return "Home";
	}

	@RequestMapping(value = "/changeText.do", method = RequestMethod.POST)
	public String changeText(final Model model,
			@ModelAttribute("text") final String inputText) {
		final String changedText = springMavenService
				.changeInputService(inputText);
		model.addAttribute("changedText", changedText);
		return "Success";
	}

}
