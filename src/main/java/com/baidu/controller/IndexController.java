package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public String index() {
		//do
		return "index" ;
	}
	
	@RequestMapping("goto_spu")
	public String goto_spu() {
		//do
		return "spu" ;
	}
	
}
