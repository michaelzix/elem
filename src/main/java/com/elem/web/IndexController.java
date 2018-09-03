package com.elem.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elem.service.IndexService;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;
	
	 @RequestMapping("/")
	 public  String index(){
		 System.out.println(indexService);
		 return  "index";
	 }
	
	
}
