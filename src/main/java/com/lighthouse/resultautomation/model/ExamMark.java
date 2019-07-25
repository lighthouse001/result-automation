package com.lighthouse.resultautomation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="exam_marks",schema="result_automation")
public class ExamMark {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Student student;
	
	@ManyToOne
	private TotalMarkPerSubject totalMarkPerSubject;
	
	private double obtainedMarks;
}
