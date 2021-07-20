package com.mutem.VO;

// 템플릿
public class templateVO {
	
	private int tem_number;			// 등록번호 (PK)
	private String tem_category;	// 카테고리 (구분)
	private String tem_name;			// 템플릿 이름
	private String tem_channel;		// 유튜브 채널
	private String tem_link;				// 유튜브 링크
	private String tem_linkshare;	// 유튜브 동영상 코드 (링크 공유)
	private String tem_format;		// 파일 형식 (포맷)
	private String tem_program;		// 프로그램
	private String reg_date;				// 등록날짜
	private int recommendation;		// 추천 (1이면 추천)
	
	public templateVO(){	}
	
	public templateVO(int tem_number, String tem_category, String tem_name, String tem_channel, String tem_link,
			String tem_linkshare, String tem_format, String tem_program, String reg_date, int recommendation) {
		this.tem_number = tem_number;
		this.tem_category = tem_category;
		this.tem_name = tem_name;
		this.tem_channel = tem_channel;
		this.tem_link = tem_link;
		this.tem_linkshare = tem_linkshare;
		this.tem_format = tem_format;
		this.tem_program = tem_program;
		this.reg_date = reg_date;
		this.recommendation = recommendation;
	}
	public int getTem_number() {
		return tem_number;
	}
	public void setTem_number(int tem_number) {
		this.tem_number = tem_number;
	}
	public String getTem_category() {
		return tem_category;
	}
	public void setTem_category(String tem_category) {
		this.tem_category = tem_category;
	}
	public String getTem_name() {
		return tem_name;
	}
	public void setTem_name(String tem_name) {
		this.tem_name = tem_name;
	}
	public String getTem_channel() {
		return tem_channel;
	}
	public void setTem_channel(String tem_channel) {
		this.tem_channel = tem_channel;
	}
	public String getTem_link() {
		return tem_link;
	}
	public void setTem_link(String tem_link) {
		this.tem_link = tem_link;
	}
	public String getTem_linkshare() {
		return tem_linkshare;
	}
	public void setTem_linkshare(String tem_linkshare) {
		this.tem_linkshare = tem_linkshare;
	}
	public String getTem_format() {
		return tem_format;
	}
	public void setTem_format(String tem_format) {
		this.tem_format = tem_format;
	}
	public String getTem_program() {
		return tem_program;
	}
	public void setTem_program(String tem_program) {
		this.tem_program = tem_program;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public int getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(int recommendation) {
		this.recommendation = recommendation;
	}
	
}
