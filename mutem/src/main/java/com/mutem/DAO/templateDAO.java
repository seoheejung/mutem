package com.mutem.DAO;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mutem.Template.StaticTemplate;
import com.mutem.VO.templateVO;

public class templateDAO {
	JdbcTemplate template;

	// 생성자
	public templateDAO() {
		// 생성자에서 StaticTemplete 패키지의 static 프로퍼티(변수)의 template를 불러온다.
		this.template = StaticTemplate.template;
	};
	
	// 리스트 반환 메서드
	public ArrayList<templateVO> list() {
		ArrayList<templateVO> tVO = null;
		String sql = "select tem_number, tem_category, tem_name, tem_channel, tem_link, tem_linkshare,"
				+ " tem_format, tem_program,reg_date,recommendation"
				+ " from template where recommendation = 1 "
				+ " order by tem_number asc";

		RowMapper<templateVO> rm = new BeanPropertyRowMapper<templateVO>(templateVO.class);
		tVO = (ArrayList<templateVO>) template.query(sql, rm);
		return tVO;
	}
	
	public ArrayList<templateVO> allList() {
		ArrayList<templateVO> tVO = null;
		String sql = "select tem_number, tem_category, tem_name, tem_channel, tem_link, tem_linkshare,"
				+ " tem_format, tem_program,reg_date,recommendation"
				+ " from template"
				+ " order by tem_number asc";

		RowMapper<templateVO> rm = new BeanPropertyRowMapper<templateVO>(templateVO.class);
		tVO = (ArrayList<templateVO>) template.query(sql, rm);
		return tVO;
	}
	
	
}
