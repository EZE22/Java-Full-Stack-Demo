package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Object findById(int employeeId);
    void saveOrUpdate(Employee theEmployee);
    void deleteById(int employeeId);
}
