package com.pojo;

// Generated 14 Sep, 2017 1:12:27 PM by Hibernate Tools 3.4.0.CR1

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer pid;
	private Pancard pancard;
	private String name;

	public User() {
	}

	public User(Pancard pancard, String name) {
		this.pancard = pancard;
		this.name = name;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Pancard getPancard() {
		return this.pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
