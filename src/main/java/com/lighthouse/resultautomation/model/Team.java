package com.lighthouse.resultautomation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name="team",schema="result_automation")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "class")
	private String sclass;

	private String shift;

	private String section;
	
	@ManyToOne
	private User user;
	
	
	@OneToMany(mappedBy="team")
	private List<Student> student=new ArrayList<>();
	
//	@OneToOne(mappedBy="team")
//	private StudentTeam studentTeam;

}
