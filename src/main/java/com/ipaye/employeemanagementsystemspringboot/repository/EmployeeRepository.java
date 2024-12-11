package com.ipaye.employeemanagementsystemspringboot.repository;

import com.ipaye.employeemanagementsystemspringboot.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
