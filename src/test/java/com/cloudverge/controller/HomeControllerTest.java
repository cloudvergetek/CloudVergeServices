package com.cloudverge.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(classes = CloudVergeWebServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HomeControllerTest {

	@Autowired
	private TestRestTemplate template;

	@Test
	public void hello_ok() throws Exception {
	    ResponseEntity<String> response = template.getForEntity("/", String.class);
	    assertThat(response.getBody()).isEqualTo("Hello World, Spring Boot!");
	}
	
}
