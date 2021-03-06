package com.shin.test.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //User클래스가  MySQL에 테이블이 생성된다. 
public class User {
	
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)// 프로젝트에 연결된 DB 넘버링 전략을 따라간다.
	private int id; // 오라클 - 시퀀스, auto_increment
	
	@Column(nullable = false, length= 30)
	private String username;
	
	@Column(nullable = false, length= 100)	
	private String password;
	
	@Column(nullable = false, length= 50)	
	private String email;
	
	@Enumerated(EnumType.STRING)
	private RoleType role;   // Enum
	
	@CreationTimestamp	
	private Timestamp createDate;
	
	
	
	
}
