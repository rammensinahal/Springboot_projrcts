package com.example.springboot_employ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_employ.dao.EmployDao;
import com.example.springboot_employ.dto.Employ;


@RestController
public class EmployController {
	@Autowired
	private EmployDao dao;
	@PostMapping("/save")
	public Employ saveEmp(@RequestBody Employ employ) {
		return dao.saveEmploy(employ);
	}
	@PutMapping("/update")
	public Employ updateEmp(@RequestParam int id,@RequestBody Employ employ ) {
		return dao.updateEmploy(id, employ);

	}
	@DeleteMapping("/delete")
	public Employ deleteEmp(@RequestParam int id) {
		return dao.deleteEmploy(id);

	}
	@GetMapping("/getbyid")
	public Employ getEmpById(@RequestParam int id) {
		return dao.getById(id);

	}
	@GetMapping("/getall")
	public List<Employ> geAllEmp() {
		return dao.getAll();

	}
}

