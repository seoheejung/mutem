package com.mutem.Template;

import org.springframework.jdbc.core.JdbcTemplate;

public class StaticTemplate {
	// JdbcTemplate : 스프링의 가장 기본적인 템플릿 색인된 파라미터(indexed parameter)
	// 				  기반의 쿼리를 통해 데이터베이스에 액세스하는 기능을 제공
	public static JdbcTemplate template;
}
