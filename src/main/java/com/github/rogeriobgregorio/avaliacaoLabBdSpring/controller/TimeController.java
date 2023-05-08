package com.github.rogeriobgregorio.avaliacaoLabBdSpring.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity.Time;
import com.github.rogeriobgregorio.avaliacaoLabBdSpring.persistence.TimeRepository;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("time")
public class TimeController {
	
	@Autowired
	private TimeRepository timeRepository;
	
	@GetMapping("/findAll")
	public void getAllTimes(HttpServletRequest request, HttpServletResponse response) {
		List<Time> times = new ArrayList<Time>();
		
		times = timeRepository.findAll();
		
		request.setAttribute("Times", times);
		try {
			request.getRequestDispatcher("mostrarTimes.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
