package com.dh.Spring1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dh.Spring1.model.dto.DepsDto;
import com.dh.Spring1.service.IDepsService;


@Controller
@RequestMapping("/deps")
public class DepsController {
	@Autowired
	private IDepsService depsService;
	
	@RequestMapping("/select")
	public @ResponseBody DepsDto select() {
		return null;
	}

	@RequestMapping("/insert")
	public @ResponseBody int insert() {
		return 0;
	}
	
	@RequestMapping("/update")
	public @ResponseBody int update() {
		return 0;
	}
	
	@RequestMapping("/delete")
	public @ResponseBody int delete() {
		return 0;
	}

	@RequestMapping("/selectAll")
	public @ResponseBody List<DepsDto> selectAll() {
		List<DepsDto> deps = null;

		try {
			deps = depsService.selectAll();
		}
		catch (Exception e) {
			// 'deps' retorna null => error
		}
		
		return deps;
	}

}
