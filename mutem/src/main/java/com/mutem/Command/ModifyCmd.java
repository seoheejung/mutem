package com.mutem.Command;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import com.mutem.DAO.adminDAO;

// ModifyCmd.java : 수정처리(contentView.jsp파일에서 수정한 내용을 DB에 등록)
public class ModifyCmd implements cmd{
	
	@Override
	public void service(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String tNumber = request.getParameter("tem_number");
		String tCategory = request.getParameter("tem_category");						// 카테고리 (구분)
		String tName = request.getParameter("tem_name");									// 템플릿 이름
		String tChannel = request.getParameter("tem_channel");							// 유튜브 채널
		String tLink = request.getParameter("tem_link");											// 유튜브 링크
		String tLinkshare = request.getParameter("tem_linkshare");						// 유튜브 동영상 코드 (링크 공유)
		String tFormat = request.getParameter("tem_format");								// 파일 형식 (포맷)
		String tProgram = request.getParameter("tem_program");							// 프로그램
		String recommendation = request.getParameter("recommendation");		// 추천 (1이면 추천)
		adminDAO tDao = new adminDAO();
		tDao.modify(tNumber, tCategory, tName, tChannel, tLink, tLinkshare, tFormat, tProgram, recommendation);
	}
}
