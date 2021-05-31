package com.example;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Integer>{
	
	@Query(value = "select * from leaves where facultyid = ?1", nativeQuery = true)
	List<Leave> findByFacultyId(int facultyid);
}
