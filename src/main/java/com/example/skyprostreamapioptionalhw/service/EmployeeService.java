package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.exception.EmployeeAlreadyAddedException;
import com.example.skyprostreamapioptionalhw.exception.EmployeeNotFoundException;
import com.example.skyprostreamapioptionalhw.exception.EmployeeStorageIsFullException;
import com.example.skyprostreamapioptionalhw.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class EmployeeService {
    private static final int LIMIT = 10;
    private final Map<String, Employee> employees = new HashMap<>();

    private String getKey(String name, String surname) {
        return name + "|" + surname;
    }

    public String add(String name,
                      String surname,
                      int department,
                      double salary) {
        Employee employee = new Employee(name, surname,department,salary);
        String key = getKey(name, surname);
        if (employees.containsKey(key)) {
            throw new EmployeeAlreadyAddedException();
        }
        if (employees.size() < LIMIT) {
            employees.put(key, employee);
            return employee;
        }
        throw new EmployeeStorageIsFullException();
    }
    public String remove(String name, String surname) {
        String key = getKey(name, surname);
        if (!employees.containsKey(key)) {
            throw new EmployeeNotFoundException();
        }
        return employees.remove(key);
    }
    public String find(String name, String surname){
        String key = getKey(name, surname);
        if (!employees.containsKey(key)) {
            throw new EmployeeNotFoundException();
        }
        return employees.get(key);
    }

    public List<Employee> getAll(){
        return new ArrayList<>(employees.values());
    }
}



