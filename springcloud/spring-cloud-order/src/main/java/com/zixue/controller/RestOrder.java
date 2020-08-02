package com.zixue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zixue.common.utils.HttpClientUtils;

/**
 * 订单系统
 * @author houdo
 *
 */
@RestController
public class RestOrder {
	@RequestMapping("/getOrderUserId")
	public String getOrderUserId(Integer id) {
		String result =HttpClientUtils.get("http://127.0.0.1:8080/member/restGetUser?id=" + id);
		return result;
	}
}
