package com.chenxing.eurekaclient.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.chenxing.eurekaclient.entity.Test01;

@Service
public class TestService {

	public String test1(Test01 obj) {
		System.out.println(JSON.toJSONString(obj));
		return "[" + obj.getName() + "女士]";
	}
}
