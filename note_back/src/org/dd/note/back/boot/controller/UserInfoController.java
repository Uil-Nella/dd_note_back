package org.dd.note.back.boot.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dd.note.back.boot.mapper.UserInfoMapper;
import org.dd.note.back.boot.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class UserInfoController {

	private UserInfoMapper userInfoMapper = null;

	@Autowired
	public void setMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		List<UserInfo> users = userInfoMapper.getAllUser();
		model.addAttribute("users", users);
		return "hello";
	}

	@RequestMapping(value = "/add")
	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("hello");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		UserInfo user = new UserInfo();
		user.setCode(UUID.randomUUID().toString());
		user.setName(userName);
		user.setPassword(password);
		userInfoMapper.addUser(user);
		List<UserInfo> list = userInfoMapper.getAllUser();
		mv.addObject("users", list);
		return mv;
	}

//	@RequestMapping(value = "/detail")
//	public String detail(ModelMap model, HttpServletRequest request,
//			HttpServletResponse response) {
//		String id = request.getParameter("id");
//		UserInfo user = userInfoMapper.getUserByCode(id);
//		model.addAttribute("user", user);
//		return "detail";
//	}
//
//	@RequestMapping(value = "/delete")
//	public ModelAndView delete(HttpServletRequest request,
//			HttpServletResponse response) {
//		String id = request.getParameter("id");
//		userInfoMapper.deleteByCode(id);
//		ModelAndView mv = new ModelAndView("hello");
//		List<UserInfo> list = userInfoMapper.getAllUser();
//		mv.addObject("users", list);
//		return mv;
//	}

//	@RequestMapping(value = "/toupdate")
//	public String toUpdate(ModelMap model, HttpServletRequest request,
//			HttpServletResponse response) {
//		String id = request.getParameter("id");
//		User user = userInfoMapper.getUserById(id);
//		model.addAttribute("user", user);
//		return "update";
//	}

//	@RequestMapping(value = "/update")
//	public ModelAndView update(HttpServletRequest request,
//			HttpServletResponse response) {
//		String id = request.getParameter("sid");
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("password");
//		User user = new User();
//		user.setId(id);
//		user.setUserName(userName);
//		user.setPassword(password);
//		userInfoMapper.update(user);
//		ModelAndView mv = new ModelAndView("hello");
//		List<User> list = userInfoMapper.getAllUser();
//		mv.addObject("users", list);
//		return mv;
//	}
}
