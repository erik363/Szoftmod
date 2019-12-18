package com.howtodoinjava.demo.controller;

import java.util.List;
import com.howtodoinjava.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.howtodoinjava.demo.model.Employee;
import javax.validation.Valid;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public List<Employee> getEmployees()
    {
        return employeeService.getAll();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@Valid @RequestBody Employee emp) {
        return employeeService.save(emp);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Long empId) throws Exception  {
        Employee em = employeeService.findById(empId);
        employeeService.delete(empId);
        return "Deleted";
    }
}
