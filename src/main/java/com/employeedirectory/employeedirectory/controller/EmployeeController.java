package com.employeedirectory.employeedirectory.controller;

import com.employeedirectory.employeedirectory.model.Employee;
import com.employeedirectory.employeedirectory.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> get() {
        return employeeService.get();
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id) {
        return employeeService.get(id);
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id) {
        employeeService.delete(id);
        return "Employee deleted with id: " +id;
    }

    @PutMapping("/employee")
    public Employee update(Employee employee) {
        employeeService.save(employee);
        return employee;
    }

}
