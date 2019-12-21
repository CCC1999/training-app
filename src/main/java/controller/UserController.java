package controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import entity.User;
import service.IUserService;

@Controller
public class UserController {
	@Autowired
	IUserService ius;
	
	@GetMapping("/login")
	public String login(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "loginForm";
	}
	@PostMapping("/login")
	public String queryAll( @ModelAttribute User user , Model m ,HttpSession hs){
		if(user==null) { 
			return "redirect:/login";
		}

		if(ius.verifyUser(user.getUsername(), user.getPassword())) {
			m.addAttribute("users", ius.findAll());
			hs.setAttribute("user", user);
			hs.setMaxInactiveInterval(30);
			return "redirect:/queryAll";
		}else {
			User u = new User();
			u.setUsername(user.getUsername());
			m.addAttribute("user",u);
			m.addAttribute("msg","用户名或密码错误！");
			return "loginForm";
		}
	}
	@RequestMapping("/queryAll")
	public String query(Model m){
			m.addAttribute("users", ius.findAll());			
			return "loginsuccess";

	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	@PostMapping("/handle")
	public String handleRegister( @ModelAttribute("u") @Valid User u,BindingResult es,Model m) {
		if(es.hasErrors()) {
			return "register";
		}
		if(ius.registerUser(u)>0) {
			return "redirect:/login";
		}else {
			return "redirect:/register";
		}
	}
}
