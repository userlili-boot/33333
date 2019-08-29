package org.free.manage;

import java.util.ArrayList;
import java.util.List;

import org.free.manage.RestTest.Student;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;

public class RestTest {
	
	
	@Test
	public void testBaidu() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		List<MediaType> m = new ArrayList<>();
		m.add(MediaType.TEXT_HTML);
		headers.setAccept(m);
		HttpEntity<Void> httpEntity = new HttpEntity<Void>(null,headers);
		ResponseEntity<String> responseEntity = restTemplate.exchange("http://www.baidu.com",HttpMethod.GET,httpEntity, String.class);
		System.out.println(responseEntity.getBody());
	}
	@Test
	public void testGet() {
		String id = "1";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8080/get?id="+id, String.class);
		Student student = JSONObject.parseObject(responseEntity.getBody(), Student.class);
		System.out.println(student.getName());
	}
	
	
	public static class Student {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
}
