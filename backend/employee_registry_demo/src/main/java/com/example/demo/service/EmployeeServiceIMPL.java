package com.example.demo.service;

import com.example.demo.controller.EmployeeController;
import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    // Injecting the employee dao layer
    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceIMPL(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Object findById(int employeeId) {
        return employeeDAO.findById(employeeId);
    }

    @Override
    public void saveOrUpdate(Employee theEmployee) {
        employeeDAO.saveOrUpdate(theEmployee);
    }

    @Override
    public void deleteById(int employeeId) {
        employeeDAO.deleteById(employeeId);
    }
}
