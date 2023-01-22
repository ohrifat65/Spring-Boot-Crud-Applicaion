package com.crud.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.employee.Repository.empRepository;
import com.crud.employee.model.empModel;

@Controller
public class empController {
	@Autowired
	empRepository repo;

	@GetMapping("/")
	public String EmpReg() {
		return "employeeReg.html";
	}

	@PostMapping("/updateForm")
	public String UpdateF(@RequestParam int eId, @ModelAttribute empModel m) {
		empModel eModel = repo.getOne(eId);
		eModel.setfName(m.getfName());
		eModel.setlName(m.getlName());
		eModel.setPosition(m.getPosition());
		eModel.setSalary(m.getSalary());
		eModel.setPhone(m.getPhone());
		eModel.setMail(m.getMail());
		eModel.setpWord(m.getpWord());
		repo.save(m);
		return "info.html";
	}

	@PostMapping("/deleteForm")
	public String DeleteF(@RequestParam int eId) {
		repo.deleteById(eId);
		return "info.html";
	}

}
