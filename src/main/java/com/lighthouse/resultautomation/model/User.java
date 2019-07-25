package com.lighthouse.resultautomation.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name= "user", schema = "result_automation")
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "user_name")
	private String userName;

	@NotNull
	@Column(name = "email")
	private String email;

	@NotNull
	@Column(name = "password")
	private String password;
	
	
	@ManyToMany
	private List<Role> role = new ArrayList<>();
	
	@OneToMany(mappedBy="user")
	private List<Team> team=new ArrayList<>();
	
	
}
