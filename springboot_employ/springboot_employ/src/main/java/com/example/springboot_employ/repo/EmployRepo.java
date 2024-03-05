package com.example.springboot_employ.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_employ.dto.Employ;

public interface EmployRepo extends JpaRepository<Employ, Integer>{

}
