package com.mutem.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.mutem.DAO.adminDAO;

// AddCmd.java : 무료 템플릿 등록 처리
public class AddCmd implements cmd{

	@Override
	public void service(Model model) {
		// 맵 자료형 선언후에 이 맵에다가 모델 객체를 담기
		Map<String, Object> map  = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String tCategory = request.getParameter("tem_category");	// 카테고리 (구분)
		String tName = request.getParameter("tem_name");				// 템플릿 이름
		String tChannel = request.getParameter("tem_channel");		// 유튜브 채널
		String tLink = request.getParameter("tem_link");						// 유튜브 링크
		String tLinkshare = request.getParameter("tem_linkshare");	// 유튜브 동영상 코드 (링크 공유)
		String tFormat = request.getParameter("tem_format");			// 파일 형식 (포맷)
		String tProgram = request.getParameter("tem_program");		// 프로그램
		
		adminDAO tDao = new adminDAO();
		tDao.add(tCategory, tName, tChannel, tLink, tLinkshare, tFormat, tProgram);
	}
}
