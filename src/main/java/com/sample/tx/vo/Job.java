package com.sample.tx.vo;

public class Job {

	private String id;
	private String title;
	private long minSalary;
	private long maxSalary;
	
	// ibatis, mybatis는 기본생성자를 통해 객체 호출
	// 따라서 생성자를 따로 설정시 기본생성자도 필요
	public Job() {}
	public Job(String id, String title, long minSalary, long maxSalary) {
		super();
		this.id = id;
		this.title = title;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(long minSalary) {
		this.minSalary = minSalary;
	}
	public long getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(long maxSalary) {
		this.maxSalary = maxSalary;
	}
	
	
}
