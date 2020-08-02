package com.zixue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * 提供服务
 * @author houdo
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class SpringBootStart {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStart.class, args);
	}
	@Value("${server.port}")
	private String port;

	/**
	 * 
	 * @methodDesc: 功能描述:(提供服务)
	 */
	@RequestMapping("/hi")
	public String hi(String name) {
		return "【"+name + "】 from 【" + port+"】";
	}
}
