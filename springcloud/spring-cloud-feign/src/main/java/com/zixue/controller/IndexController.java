
package com.zixue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zixue.service.FeignService;




@RestController
public class IndexController {

	@Autowired
	private FeignService feignService;

	@RequestMapping("/hi")
	public String hi(String name) {
		return feignService.hi(name);
	}
}
