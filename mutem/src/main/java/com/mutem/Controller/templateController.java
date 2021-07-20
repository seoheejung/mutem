package com.mutem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mutem.Command.AllListCmd;
import com.mutem.Command.ListCmd;
import com.mutem.Command.cmd;
import com.mutem.Template.StaticTemplate;
@Controller
public class templateController {

	cmd cmd = null;
	
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template){
		this.template = template;
		StaticTemplate.template = this.template;
	}
	
	@RequestMapping("/index")
	public String index(Model model){
		System.out.println("-------------- index() 호출 ---------------------");
		cmd = new ListCmd();
		cmd.service(model); 
		
		return "index";
	}
	
	@RequestMapping("/list")
	public String list(Model model){
		System.out.println("-------------- list() 호출 ---------------------");
		cmd = new ListCmd();
		cmd.service(model); 
		
		return "list";
	}
	
	@RequestMapping("/allList")
	public String allList(Model model){
		System.out.println("-------------- AllList() 호출 ---------------------");
		cmd = new AllListCmd();
		cmd.service(model); 
		
		return "allList";
	}
}
