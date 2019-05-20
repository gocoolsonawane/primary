package com.example.responsetester;

import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class TestEndPoint {

	@GetMapping("/test")
	public String test(HttpServletRequest request) throws JsonProcessingException {

		Enumeration<String> code = request.getParameterNames();
		Iterator<String> asIterator = code.asIterator();
		while (asIterator.hasNext()) {
			System.out.println(request.getParameter(asIterator.next()));
		}
		
		// System.out.println(new ObjectMapper().writeValueAsString(response));
		return "Success";
	}

	

}
