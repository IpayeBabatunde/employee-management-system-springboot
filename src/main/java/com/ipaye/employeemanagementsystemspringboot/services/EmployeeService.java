package com.ipaye.employeemanagementsystemspringboot.services;

import com.ipaye.employeemanagementsystemspringboot.Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    void save (Employee employee);

    Employee getById(Long id);

    void deleteById(Long id);

}
