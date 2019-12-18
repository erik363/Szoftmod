package com.howtodoinjava.demo.repository;

import com.howtodoinjava.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    List<Employee> findAll();

}
