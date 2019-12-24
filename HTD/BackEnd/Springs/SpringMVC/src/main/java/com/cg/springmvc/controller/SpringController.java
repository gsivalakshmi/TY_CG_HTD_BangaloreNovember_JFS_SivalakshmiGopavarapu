package com.cg.springmvc.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.cg.springmvc.bean.User;

@Controller
public class SpringController {
	@Autowired
	private ServletContext context;
	
	
	@RequestMapping("/hello")
	public String hello(ModelMap map) {
		map.addAttribute("msg", "Helloo HEM@@Kukka.....!!!!!!!!!!");
		return "index";
	}

	//QUERY STRING....
	//@RequestMapping(path= "/query",method=RequestMethod.GET )
	@GetMapping("/query")
	public String query(@RequestParam("name")String name,
			@RequestParam("age")int age,ModelMap m) {

		m.addAttribute("name",name);
		m.addAttribute("age",age);

		return "query";
	}
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	@PostMapping("/form")
	public String form(User user,ModelMap m) {
		m.addAttribute("name",user.getName());
		m.addAttribute("email",user.getEmail());
		m.addAttribute("password",user.getPassword());
		m.addAttribute("gender",user.getGender());
		return "form";

	}
	//CREATE COOKIE
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse response) {
		Cookie cookie=new Cookie("name", "Shiva");
		response.addCookie(cookie);
		return "createCookie";
	}

	@GetMapping("/getCookie")
	public String getCookie(ModelMap map,  
			@CookieValue(name="name",required=false)String name) {
		//		map.addAttribute("name",name);
		if(name!=null)
			map.addAttribute("name",name);
		else
			map.addAttribute("name","Baddri");
		return "getCookie";
	}
	//PATH PARAM
	@GetMapping("path/{movieName}/{hero}")//Accept dynamic values
	public String path(@PathVariable("movieName")String movieName,
			@PathVariable("hero")String hero,ModelMap map) {
		map.addAttribute("movieName",movieName);
		map.addAttribute("hero",hero);

		return "pathvalue";
	}
	//Forward to another controller
	@GetMapping("/forward")
	public String forward() {
		return "forward:hello"; //here "hello" is controller name
	}

	//include (we never use in controller,used in JSP)

	//REDIRECT(in JSP)
	public String redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("https://www.google.com");
		return "";
	}
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:https://www.google.com";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String login(String username,String password, 
			HttpServletRequest request,ModelMap map) {
		if(username.equals("user")&& password.equals("shivac")) {
			User user=new User();
			user.setName(username);
			user.setEmail("shiv@gmail.com");
			user.setPassword(password);
			user.setGender("female");
			HttpSession session= request.getSession();
			session.setAttribute("user", user);
			map.addAttribute("msg","user login successfully!!!");
			return "home";
		}else {
			map.addAttribute("msg","Invalid Credentials..pls try again!!");
			return "login";
		}


	}
	//	@PostMapping("/login")
	//	public String login(HttpSession session) {
	//		return "home";
	//	}

	@GetMapping("/home")
	public String home(@SessionAttribute(name="user",required=false) User user) {
		if(user!=null) {
			return "home";
		}else {
			return "login";
		}
	}
	@GetMapping("setappattribute")
	public String setAppAttribute() {
		context.setAttribute("msg", new Object());
		return "setcontext";
	}
	@GetMapping("getappattribute")
	public String getAppAttribute() {
		System.out.println(context.getAttribute("msg"));
		return "getcontext";
	}
}
