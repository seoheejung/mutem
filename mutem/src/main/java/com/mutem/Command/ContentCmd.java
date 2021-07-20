package com.mutem.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.mutem.DAO.adminDAO;
import com.mutem.VO.templateVO;

//ContentCmd.java : 받아온 번호로 객체 전달
public class ContentCmd implements cmd{

	@Override
	public void service(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String tNo = request.getParameter("tem_number");
		adminDAO dao = new adminDAO();
		templateVO tVo = dao.contentView(tNo);
		model.addAttribute("modify", tVo);
	}
}
