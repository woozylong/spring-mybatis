package com.youyou.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.youyou.model.User;
import com.youyou.service.IUserService;

@Controller
@RequestMapping("front")
public class LoginController {

	@Resource
	private IUserService userService = null;
	
	@Autowired
	private HttpServletRequest httpServletRequest;

	@RequestMapping("login")
	public ModelAndView signIn(@RequestParam("id") Integer userId,
			@RequestParam("pwd") String password,HttpServletResponse response) throws IOException {
		User u = userService.getUserById(userId);
		if (u != null && u.getPassword().equals(password)) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("main");
			mv.addObject("user", u);
			return mv;
		} else {
			//response.sendRedirect(httpServletRequest.getServletContext().getContextPath()+"/index.jsp");
			ModelAndView mv = new ModelAndView(new RedirectView(httpServletRequest.getServletContext().getContextPath()+"/index.jsp"));
			httpServletRequest.setAttribute("flag", false);
			return mv;
		}

	}
}
