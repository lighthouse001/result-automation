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
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Column(name="subject_name")
	private String sname;
	
	@NotNull
	@Column(name="class")
	private String sclass;
	
	@OneToMany(mappedBy="subject")
	private final List<TotalMarkPerSubject> totalMarkPerSubject=new ArrayList<>();

}
