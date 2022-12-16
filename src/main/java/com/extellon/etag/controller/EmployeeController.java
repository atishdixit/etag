package com.extellon.etag.controller;

import com.extellon.etag.domain.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/get-employee")
    public ResponseEntity<Employee> getEmployee(@RequestParam("param") String param) {
        Employee employee = new Employee(Integer.parseInt(param.trim()), "Test1");
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}