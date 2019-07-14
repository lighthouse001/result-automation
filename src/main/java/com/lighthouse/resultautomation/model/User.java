package com.lighthouse.resultautomation.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "user", schema = "result_automation")
public class User {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	public User() {
	}

	public User(String name,
				String userName,
				String email,
				String password) {
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
}
