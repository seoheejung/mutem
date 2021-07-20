package com.mutem.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.mutem.DAO.adminDAO;
import com.mutem.VO.adminVO;

public class LoginCmd implements cmd {

	@Override
	public void service(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		int check = 0;
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		adminDAO dao = new adminDAO();
		adminVO aVo  = dao.login(id, pw);
		if (aVo != null) {
			check = 1;
		}
		model.addAttribute("check", check);
		model.addAttribute("id", id);
		
	}

}
