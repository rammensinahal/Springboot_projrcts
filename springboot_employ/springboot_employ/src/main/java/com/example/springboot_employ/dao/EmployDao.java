package com.example.springboot_employ.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springboot_employ.dto.Employ;
import com.example.springboot_employ.repo.EmployRepo;
@Repository
public class EmployDao {
	@Autowired
	private EmployRepo repo1;
	
	public Employ saveEmploy(Employ employ) {
		return repo1.save(employ);
	}
	public Employ updateEmploy(int id ,Employ employ) {
		Optional<Employ> e=repo1.findById(id);
		if(e.isPresent()) {
			employ.setId(id);
			return repo1.save(employ);
		}else {
			return null;
		}
	}
	public Employ deleteEmploy(int id) {
		Employ e=repo1.findById(id).get();
		repo1.deleteById(id);
		return e;
	}
	public Employ getById(int id) {
		return repo1.findById(id).get();
	}
	public List<Employ> getAll(){
		return repo1.findAll();

	}
}
