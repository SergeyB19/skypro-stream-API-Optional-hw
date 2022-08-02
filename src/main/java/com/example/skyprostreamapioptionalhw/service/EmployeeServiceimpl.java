package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.exception.EmployeeAlreadyAddedException;
import com.example.skyprostreamapioptionalhw.exception.EmployeeNotFoundException;
import com.example.skyprostreamapioptionalhw.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class EmployeeServiceimpl implements EmployeeService {
    private Map<String, Employee> employees;

    public void EmployeeServiceimpl(List<Employee> employeeList) throws EmployeeAlreadyAddedException {
        this.employees = new HashMap<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.remove(employee.getFullName());
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firstName, String lastName){
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException();
    }


    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }
}



