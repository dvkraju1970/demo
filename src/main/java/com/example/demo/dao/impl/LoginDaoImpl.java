package com.example.demo.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.LoginDao;
import com.example.demo.vo.User;

@Repository
public class LoginDaoImpl implements LoginDao {

	
	@Override
	public boolean validation(User user) {
		final String uri = "http://localhost:8091//database//valid";
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<User> entity = new HttpEntity<User>(user, headers);
	     
	    ResponseEntity<Boolean> result = restTemplate.exchange(uri, HttpMethod.POST, entity, Boolean.class);
	     
	    return result.getBody();
	}
	
}
