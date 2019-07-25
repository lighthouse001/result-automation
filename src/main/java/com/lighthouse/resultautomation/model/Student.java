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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="student",schema="result_automation")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "father_name")
	private String fatherName;

	@NotNull
	@Column(name = "mother_name")
	private String motherName;

	@NotNull
	@Column(name = "address")
	private String address;
	
	@NotNull
	@Column(name = "mobile")
	private String mobile;

	
	@ManyToOne
	private Team team;
	
	private int roll;
	
	@OneToMany(mappedBy="student")
	private List<ExamMark> examMarks=new ArrayList<>();
}
