package com.dh.Spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	@RequestMapping("/")
	public String irInicio() {
		return("index");
	}

	@RequestMapping("/Deps")
	public String irDeps() {
		return("Deps");
	}

}
