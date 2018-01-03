package cn.itcast.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
/**
 * 一:定义一个SpringMvc用来显示页面
 */
	@RequestMapping("/list")
	public String list(Model model){
		//設置頁面需要返回的數據
		List<User> userList=userService.findUserList();
		model.addAttribute("userList", userList);
		//设置返回的页面
		return "list";
	}
public UserService getUserService() {
	return userService;
}
public void setUserService(UserService userService) {
	this.userService = userService;
}
	
}
