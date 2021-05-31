package com.example;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LeaveController {

	@Autowired
	private LeaveService leaveService;
	
	@GetMapping("/leaves")
	@ResponseBody
	public List<Leave> getAllLeaves() {
	    return leaveService.listAll();
	}
	
	@GetMapping("/leaves/{id}")
	@ResponseBody
	public ResponseEntity<Leave> getLeaveById(@PathVariable Integer id) {
		try {
	        Leave leave = leaveService.get(id);
	        return new ResponseEntity<Leave>(leave, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Leave>(HttpStatus.NOT_FOUND);
	    }  
	}
	
	@GetMapping("faculty/leaves/{facultyid}")
	@ResponseBody
	public List<Leave> getLeavesByFacultyId(@PathVariable Integer facultyid) {
		
	        List<Leave> leave = leaveService.listByFacultyId(facultyid);
	        return leave;
	  
	}
	
	@PostMapping("/leave")
	public void registerLeave(@RequestBody Leave leave) {
	    leaveService.save(leave);
	}
}
