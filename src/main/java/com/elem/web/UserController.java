package com.elem.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elem.bean.FoodCategory;

@RestController
public  class UserController {

	@GetMapping("/user/{id}")
	public Map<String, Object> user(@PathVariable Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("date", System.currentTimeMillis());
		return map;
	}
	
	
	@PostMapping(value="/foodCategory",consumes={"application/json"})
	public FoodCategory add(@RequestBody FoodCategory foodCategory){
		return foodCategory;
	}
	
}
