package com.mutem.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import com.mutem.Template.StaticTemplate;
import com.mutem.VO.adminVO;
import com.mutem.VO.templateVO;

public class adminDAO {
	JdbcTemplate template;

	// 생성자
	public adminDAO() {
		// 생성자에서 StaticTemplete 패키지의 static 프로퍼티(변수)의 template를 불러온다.
		this.template = StaticTemplate.template;
	};
	
	// 등록 메서드
	public void add(final String tCategory, final String tName, final String tChannel, final String tLink, final String tLinkshare, final String tFormat, final String tProgram) {
		String sql = "insert into template(tem_category, tem_name, tem_channel, tem_link, tem_linkshare,"
				+ " tem_format, tem_program,reg_date,recommendation)"
				+ " values(?,?,?,?,?,?,?,date_format(now(),'%Y/%m/%d'),0)";
		 
		this.template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement preparedStatement) throws SQLException {
				preparedStatement.setString(1, tCategory);
				preparedStatement.setString(2, tName);
				preparedStatement.setString(3, tChannel);
				preparedStatement.setString(4, tLink);
				preparedStatement.setString(5, tLinkshare);
				preparedStatement.setString(6, tFormat);
				preparedStatement.setString(7, tProgram);
			}
		});
	}
	
	// 삭제 메서드
	public void delete(final int tNumber) {
		String sql = "delete from template where tem_number = ?";

		int i = this.template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, tNumber);
			}
		});
		System.out.println(i +"개 수정 완료");
	}
	
	// 수정 메서드
	public void modify(final String tNumber, final String tCategory, final String tName, final String tChannel, final String tLink, final String tLinkshare,
			final String tFormat, final String tProgram, final String recommendation) {
		String sql = "UPDATE template SET tem_category = ?, tem_name = ?, tem_channel = ?, tem_link = ?, tem_linkshare = ?, "
				+ " tem_format = ?, tem_program = ?,  recommendation = ? "
				+ " where tem_number = ?";
		int i = this.template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement preparedStatement) throws SQLException {
					preparedStatement.setString(1, tCategory);
					preparedStatement.setString(2, tName);
					preparedStatement.setString(3, tChannel);
					preparedStatement.setString(4, tLink);
					preparedStatement.setString(5, tLinkshare);
					preparedStatement.setString(6, tFormat);
					preparedStatement.setString(7, tProgram);
					preparedStatement.setInt(8, Integer.parseInt(recommendation));
					preparedStatement.setInt(9, Integer.parseInt(tNumber));
					System.out.println(Integer.parseInt(tNumber));
			}
		});
		System.out.println(i +"개 수정 완료");
	}
	
	// 템플릿 내용 반환 메서드
	public templateVO contentView(final String tem_number) {
		String sql = "select * from template where tem_number =" + tem_number;

		RowMapper<templateVO> rm = new BeanPropertyRowMapper<templateVO>(templateVO.class);
		// queryForObject 메소드 : 쿼리 실행 결과의 행의 개수가 한개인 경우에 사용하는 메소드
		return this.template.queryForObject(sql, rm);
	}

	public adminVO login(String id, String pw) {
		try {
			String sql = "select * from admin where id ='" + id + "' AND pw='" + pw + "'";
			RowMapper<adminVO> rm = new BeanPropertyRowMapper<adminVO>(adminVO.class);
			return this.template.queryForObject(sql, rm);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
	
	
	
}
