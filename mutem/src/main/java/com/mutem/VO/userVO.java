package com.mutem.VO;

// 회원
public class userVO {
	// DTO 데이터베이스에서 가지고 오는 데이터를 저장할 수 있도록 변수 선언
	// 멤버 필드는 private로 선언하고, 필드에 접근할 수 있는setter, getter 메서드를 생성
	// 생성자 포함 필수
	
	private String email;
	private String pw;
	private String name;
	private String reg_date;
	
	public userVO(){ 	}
	public userVO(String email, String pw, String name, String reg_date) {
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.reg_date = reg_date;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
}
