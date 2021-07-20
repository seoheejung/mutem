package com.mutem.Command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.mutem.DAO.templateDAO;
import com.mutem.VO.templateVO;

//ListCmd.java : 게시판의 리스트를 DB로부터 가져오는 객체
public class ListCmd implements cmd{

	@Override
	public void service(Model model) {
		templateDAO dao = new templateDAO();
		ArrayList<templateVO> tVO = dao.list();
		model.addAttribute("list", tVO);
	}
}
