package com.jinseok.blog.mvc.model;

public class BoardVO {

	private int bbs_no;
	private String bbs_title;
    private String bbs_content;
    private int bbs_read_count;
    private String bbs_writer;
	public int getBbs_no() {
		return bbs_no;
	}
	public void setBbs_no(int bbs_no) {
		this.bbs_no = bbs_no;
	}
	public String getBbs_title() {
		return bbs_title;
	}
	public void setBbs_title(String bbs_title) {
		this.bbs_title = bbs_title;
	}
	public String getBbs_content() {
		return bbs_content;
	}
	public void setBbs_content(String bbs_content) {
		this.bbs_content = bbs_content;
	}
	public int getBbs_read_count() {
		return bbs_read_count;
	}
	public void setBbs_read_count(int bbs_read_count) {
		this.bbs_read_count = bbs_read_count;
	}
	public String getBbs_writer() {
		return bbs_writer;
	}
	public void setBbs_writer(String bbs_writer) {
		this.bbs_writer = bbs_writer;
	}
    
    
}
