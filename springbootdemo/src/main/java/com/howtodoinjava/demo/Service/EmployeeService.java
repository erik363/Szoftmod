package com.howtodoinjava.demo.Service;

import com.howtodoinjava.demo.model.Employee;
import com.howtodoinjava.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
       return employeeRepository.save(employee);
    }

    public Employee findById(Long empId) {
        return employeeRepository.findOne(empId);
    }

    public void delete(Long empId) {
        employeeRepository.delete(empId);
    }
}
