package com.employeedirectory.employeedirectory.dao;

import com.employeedirectory.employeedirectory.model.Employee;

import java.util.List;

//for Database Access
//getting or manipulating the data to and from the DB
public interface EmployeeDAO {
    List<Employee> get();
    Employee get(int Id);
    void save(Employee employee);
    void delete(int Id);
}
