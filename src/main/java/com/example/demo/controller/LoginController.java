package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.LoginService;
//import com.example.demo.service.impl.MyUserDetailsService;
//import com.example.demo.util.JwtUtil;
import com.example.demo.vo.AuthenticationRequest;
import com.example.demo.vo.AuthenticationResponse;
import com.example.demo.vo.User;

@Controller
@RequestMapping("/Entry/")
public class LoginController {

	@Autowired
	LoginService loginService;
	
//	@Autowired
//	private AuthenticationManager authenticationManager;
	
//	@Autowired
//	private MyUserDetailsService userDetailsService;
//	
//	@Autowired
//	private JwtUtil jwtTokenUtil;
	
	@PostMapping("validation")
	public ModelAndView Login(User user) {
		ModelAndView mav=new ModelAndView();
		if(loginService.validation(user))
			mav.setViewName("success");
		else
			mav.setViewName("failure");
		return mav;
	}
	
	@GetMapping("view")
	public ModelAndView LoginForm()
	{
		return new ModelAndView("view");
	}
	
//	@PostMapping("authenticate")
//	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
//		
//		try {
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(),authenticationRequest.getPassword()));
//			
//		}
//		catch(BadCredentialsException e) {
//			throw new Exception("Incorrect username or password",e);
//		}
//		
//		final UserDetails userDetails= userDetailsService.loadUserByUsername(authenticationRequest.getUserName());
//		final String jwt=jwtTokenUtil.generateToken(userDetails);
//		return ResponseEntity.ok(new AuthenticationResponse(jwt));
//		
//	}
	
}
