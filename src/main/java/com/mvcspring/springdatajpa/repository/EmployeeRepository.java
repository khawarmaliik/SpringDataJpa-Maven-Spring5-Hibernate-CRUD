package com.mvcspring.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mvcspring.springdatajpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Modifying(clearAutomatically = true)
    @Query("UPDATE Employee c SET c.empName = :empName WHERE c.empId = :empId")
    public int updateName(@Param("empId") int empId, @Param("empName") String empName);
}
