package com.core.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.pojo.User;
import com.core.service.UserService;

@Controller
public class UserController {
   
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public String login(String usercode,String password,Model model,HttpSession session)
	{
		
		User user = userService.findUser(usercode, password);
		
		if(user!=null)
		{
			session.setAttribute("userName", user.getUser_name());
			session.setAttribute("userId", user.getUser_id());
			return "index";
		}
		model.addAttribute("msg", "<script type='text/javascript'>alert('ÕËºÅ»òÃÜÂë´íÎó!!!');</script>");
		return "login";
		
	}
	/*
	 * ÍË³öµÇÂ¼
	 */
	@GetMapping("/out")
	public String out(HttpSession session)
	{
		//Çå³ýsession
		session.invalidate();
		
		return "login";
		
	}
}
