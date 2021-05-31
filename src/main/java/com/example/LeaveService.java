package com.example;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LeaveService {
	
	@Autowired
	private LeaveRepository repo;
	
	 public List<Leave> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Leave leave) {
	        repo.save(leave);
	    }
	     
	    public Leave get(Integer id) {
	        return repo.findById(id).get();
	    }
	    
	    public List<Leave> listByFacultyId(int facultyid) {
	    	return repo.findByFacultyId(facultyid);
	    }

}
