package com.chenxing.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chenxing.eurekaclient.service.TestService;

@RestController
public class TestController {
	@Value("${server.port}")
	String port;

	@Value("${spring.application.name}")
	String appname;

	@Autowired
	TestService tService;

	@RequestMapping("/hi")
	public String sayHi(@RequestParam String name) {
		String newName = tService.test1(name);
		return "hi " + newName + "。我是" + appname + " 我的端口号:" + port;
	}
}
