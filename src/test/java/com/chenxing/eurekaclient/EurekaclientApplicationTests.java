package com.chenxing.eurekaclient;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chenxing.eurekaclient.entity.Test01;
import com.chenxing.eurekaclient.service.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaclientApplicationTests {
	@Autowired
	TestService tService;

	@Test
	public void contextLoads() {
		Test01 t = new Test01();
		t.setName("你好");
		Map<String, String> tm = new HashMap<String, String>();
		tm.put("asdf", "西班牙");
		tm.put("asdf11", "中过");
		t.setTm(tm);
		System.out.println("jieguo:" + tService.test1(t));
	}

}
