package com.sannix.sanket.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.sannix.sanket.registration.entitiy.Employee;

@Component
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
