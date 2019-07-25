package com.lighthouse.resultautomation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
	
	@Data
	@Entity
	@Table(name="term",schema="result_automation")
	public class Term {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		
		@NotNull
		@Column(name="term_name")
		private String termName;
		
		@NotNull
		@Column(name="class")
		private String tclass;
		
	
		@OneToMany(mappedBy="term")
		private final List<TotalMarkPerSubject> totalMarkPerSubjects=new ArrayList<>();

	}


