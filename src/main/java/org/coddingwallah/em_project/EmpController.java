package org.coddingwallah.em_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmpController {
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employees=new ArrayList<>();
        employees.add(null);
        return employees;
    }
    

    
}
