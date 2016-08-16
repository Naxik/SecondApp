package ru.naxxer.web.controller.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author naxxer
 *         date: 04.07.16.
 */
@RestController
public class ApplicationController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
