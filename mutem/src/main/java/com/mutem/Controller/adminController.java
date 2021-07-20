package com.mutem.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mutem.Command.AddCmd;
import com.mutem.Command.AllListCmd;
import com.mutem.Command.ContentCmd;
import com.mutem.Command.DeleteCmd;
import com.mutem.Command.ListCmd;
import com.mutem.Command.LoginCmd;
import com.mutem.Command.ModifyCmd;
import com.mutem.Command.cmd;
import com.mutem.DAO.adminDAO;
import com.mutem.Template.StaticTemplate;
@Controller
public class adminController {

	cmd cmd = null;
	
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template){
		this.template = template;
		StaticTemplate.template = this.template;
	}
	
	@RequestMapping("/admin")
	public String admin(Model model){
		System.out.println("-------------- admin() 호출 ---------------------");
		cmd = new AllListCmd();
		cmd.service(model); 
		
		return "admin";
	}
	
	@RequestMapping("/adminLogin")
	public String adminLogin(Model model){
		System.out.println("--------------adminLogin() 호출 ---------------------");
		
		return "adminLogin";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		System.out.println("-------------- login() 호출 ---------------------");
		model.addAttribute("request",request);
		cmd = new LoginCmd();
		cmd.service(model); 
		return "loginPro";
	}
	
	@RequestMapping("/adminLogout")
	public String adminLogout(Model model){
		System.out.println("--------------adminLogout() 호출 ---------------------");
		
		return "adminLogout";
	}
	
	@RequestMapping("/add")
	public String add(Model model){
		System.out.println("-------------- add() 호출 ---------------------");
		
		return "add";
	}
	
	@RequestMapping("/addTemplate")
	public String addTemplate(HttpServletRequest request, Model model){
		System.out.println("--------------addTemplate() 호출-----------------");
		model.addAttribute("request",request);
		cmd = new AddCmd();
		cmd.service(model); 
		
		return "addTemplate";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(HttpServletRequest request, Model model){
		System.out.println("-------------- modify() 호출 ---------------------");
		model.addAttribute("request",request);
		cmd = new ContentCmd();
		cmd.service(model); 
		return "modify";
	}
	
	@RequestMapping("/modifyTemplate")
	public String modifyTemplate(HttpServletRequest request, Model model){
		System.out.println("--------------modifyTemplate() 호출-----------------");
		model.addAttribute("request",request);
		cmd = new ModifyCmd();
		cmd.service(model); 
		
		return "modifyTemplate";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, Model model){
		System.out.println("--------------delete() 호출-----------------");
		model.addAttribute("request",request);
		cmd = new DeleteCmd();
		cmd.service(model); 
		return "delete";
	}
	
}
