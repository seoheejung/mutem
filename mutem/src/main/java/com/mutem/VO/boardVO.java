package com.mutem.VO;

// 새소식 게시판
public class boardVO {

	private int num;				 // 번호
	private String title;			 // 제목
	private String content;	 // 내용
	private String reg_date;	 // 등록날짜
	private String writer;		 // 글쓴이
	private String 	pw;			 // 비밀번호
	
	public boardVO() {	}

	public boardVO(int num, String title, String content, String reg_date, String writer, String pw) {
		this.num = num;
		this.title = title;
		this.content = content;
		this.reg_date = reg_date;
		this.writer = writer;
		this.pw = pw;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
