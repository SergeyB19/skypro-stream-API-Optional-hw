package com.example.skyprostreamapioptionalhw.controller;

import com.example.skyprostreamapioptionalhw.service.DepartmentServiceimpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    private final DepartmentServiceimpl departmentService;

    public DepartmentController(DepartmentServiceimpl departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(path = "/departments/max-salary")
    public String maxSalaryEmployee(@RequestParam("departmentId") Integer departmentId) {
        return employee;
    }

    @GetMapping(path = "/departments/min-salary")
    public String minSalaryEmployee(@RequestParam("departmentId") Integer departmentId) {
        return employee;

    }

    @GetMapping(path = "/departments/all")
    public String allEmployeeInDepartment(@RequestParam("fullName") String fullName,
                                          @RequestParam("department") Integer department) {
        return employee;
    }

    @GetMapping(path = "/departments/all")
    public String allEmployeeInDepartment(@RequestParam("fullName") String fullName,
                                          @RequestParam("department") Integer department) {
        return employee;
    }
}
