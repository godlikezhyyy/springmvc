package com.zhong.test.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	@Id
	private Integer userid;
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password
				+ ", username=" + username + "]";
	}

	@Column(name="userPassword")
	private String password;
	
	private String username;
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public User(){
		
	}
	
	public User(int userid, String password) {
		this.userid = userid;
		this.password = password;
	}

	

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
