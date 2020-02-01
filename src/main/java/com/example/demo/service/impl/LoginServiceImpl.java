package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginDao;
import com.example.demo.service.LoginService;
import com.example.demo.vo.User;

@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	LoginDao loginDao;
	
	@Override
	public boolean validation(User user) {
		// TODO Auto-generated method stub
		return loginDao.validation(user); 
	}

}
