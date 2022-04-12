package com.shin.test.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

public class Board {
	
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)// 프로젝트에 연결된 DB 넘버링 전략을 따라간다.
	private int id; // 오라클 - 시퀀스, auto_increment
	
	@Column(nullable = false, length = 100)
	private String title; 
	
	@Lob // 대용량 데이터
	private String content; //섬머노트 라이브러리<html>태그가 섞여서 디자인 됨.
	
	@ColumnDefault("0")
	private int count; //조회수
	
	@ManyToOne(fetch = FetchType.EAGER) // Many = Board , User = One
	@JoinColumn(name = "userId")
	private User user; // DB는 오브젝트를 저장할 수 없다. FK, 자바는 오브젝트를 저장할 수 있다.

	@OneToMany(mappedBy="board", fetch= FetchType.EAGER) //mappedBy 연관관계의 주인이 아니다. DB에 칼럼을 만들지 마세요.
	private List<Reply> reply;
	
	@CreationTimestamp
	private Timestamp createDate;
	
}
