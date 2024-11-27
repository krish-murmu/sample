package org.krish.sample.controller;

import org.springframework.web.bind.annotation.RestController;
import org.krish.sample.domain.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController {

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee emp) {
        //TODO: process POST request
        
        return emp;
    }
    
}
