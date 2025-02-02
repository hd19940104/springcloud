
package com.zixue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zixue.service.HelloService;

@RestController
public class RibbonController {
	@Autowired
	private HelloService helloService;
     @RequestMapping("/hi")
	public String hi(String name) {
		return helloService.hi(name);
	}

}
