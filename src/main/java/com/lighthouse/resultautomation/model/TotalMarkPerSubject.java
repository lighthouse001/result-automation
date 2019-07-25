package com.lighthouse.resultautomation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="total_marks_persubject",schema="result_automation")
public class TotalMarkPerSubject {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		
		@ManyToOne
		private Subject subject;
		
		@ManyToOne
		private Term term;
		
		private String totalMarks;
		
		@OneToMany(mappedBy="student")
		private List<ExamMark> examMarks=new ArrayList<>();
		
		

}
