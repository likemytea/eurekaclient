package com.chenxing.eurekaclient.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String test1(String name) {
		return "[" + 9 + name + "]";
	}
}
