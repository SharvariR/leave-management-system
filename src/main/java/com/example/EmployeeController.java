package com.example;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/employees")
	@ResponseBody
	public List<Employee> getAllEmployees() {
	    return empService.listAll();
	}
	
	@GetMapping("/employees/{id}")
	@ResponseBody
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
		try {
	        Employee employee = empService.get(id);
	        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	    }  
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
	    empService.save(employee);
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {
		try {
			Employee emp = empService.get(id);
			emp.setEmpName(emp.getEmpName());
			emp.setEmpName(employee.getEmpName());
			emp.setEmail(employee.getEmail());
			emp.setDept(employee.getDept());
			emp.setGender(employee.getGender());
			emp.setStatus(employee.getStatus());
			emp.setDob(employee.getDob());
			empService.save(emp);
			return new ResponseEntity<Employee>(HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
	    empService.delete(id);
	}
}
