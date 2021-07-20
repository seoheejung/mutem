package com.mutem.VO;

// 즐겨찾기
public class favoritesVO {
	private int number;				// 번호
	private String user_email;		// 회원 이메일
	private String tem_number;	// 템플릿 등록번호
	
	public favoritesVO() {	}
	public favoritesVO(int number, String user_email, String tem_number) {
		this.number = number;
		this.user_email = user_email;
		this.tem_number = tem_number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getTem_number() {
		return tem_number;
	}
	public void setTem_number(String tem_number) {
		this.tem_number = tem_number;
	}
	
}
