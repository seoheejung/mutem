package com.mutem.Command;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import com.mutem.DAO.adminDAO;

// DeleteCmd.java : 삭제처리
public class DeleteCmd implements cmd{

	@Override
	public void service(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		int tNumber = Integer.parseInt(request.getParameter("tem_number"));
		adminDAO tDao = new adminDAO();
		tDao.delete(tNumber);
	}
}
