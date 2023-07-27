package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.signupentity;

import jakarta.transaction.Transactional;

public interface signuprepo extends JpaRepository<signupentity,Integer>{
	
}