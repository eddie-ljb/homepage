package com.ebader.BaderHomepage.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomepageController {
	
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping(value = "/")
	public ModelAndView showHomepage(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("index.html");
	}
	
	@GetMapping(value = "/contact")
	public ModelAndView showContactPage(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("contact.html");
	}
	
	@GetMapping(value = "/projects")
	public ModelAndView showProjectsPage(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("projects.html");
	}
	
	@GetMapping(value = "/resumee")
	public ModelAndView showResumeePage(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("resume.html");
	}
	
	@GetMapping(value = "/impressum")
	public ModelAndView showImpressumPage(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("impressum.html");
	}

}
