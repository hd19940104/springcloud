package com.zixue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * @author houdo
 *
 */
@EnableEurekaServer
@SpringBootApplication

public class SpringBootStart {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStart.class, args);
	}
}
