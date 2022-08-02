package com.example.skyprostreamapioptionalhw.controller;

import com.example.skyprostreamapioptionalhw.model.Employee;
import com.example.skyprostreamapioptionalhw.service.EmployeeServiceimpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeServiceimpl employeeServiceimpl;

    public EmployeeController(EmployeeServiceimpl employeeServiceimpl) {
        this.employeeServiceimpl = employeeServiceimpl;
    }

    @GetMapping(path = "/Employee/add")
    public String addEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeServiceimpl.add(employee);
        return employee;
    }

    @GetMapping(path = "/Employee/remove")
    public String removeEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeServiceimpl.remove(employee);
        return employee;
    }

    @GetMapping(path = "/Employee/find")
    public String findEmployee(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeServiceimpl.find(employee);
        return employee;
    }
}
