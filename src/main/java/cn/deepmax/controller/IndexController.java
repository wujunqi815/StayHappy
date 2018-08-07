package cn.deepmax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.deepmax.pojo.User;
import cn.deepmax.service.UserService;

@Controller
public class IndexController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String showIndex(){
		User user = userService.getUser(1);
		System.out.println("user:" + user.getName());
		System.out.println("password:" + user.getPassword());
		
		return "index";
	}
}
