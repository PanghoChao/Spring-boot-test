package com.shin.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shin.test.model.User;

//DAO
public interface UserRepository extends JpaRepository<User,Integer>{

}
