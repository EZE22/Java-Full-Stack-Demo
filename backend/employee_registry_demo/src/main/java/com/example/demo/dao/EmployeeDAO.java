package com.example.demo.dao;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Object findById(int theId);
    void saveOrUpdate(Employee theEmployee);
    void deleteById(int theId);
}
