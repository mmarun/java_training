package com.SpringBootDemo.SpringBootDemo.controller;

import com.SpringBootDemo.SpringBootDemo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/home")
public class EmployeeController {

    static List<Employee> list;
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployee()
    {
       list=new ArrayList<>();
       list.add(Employee.builder().employeeId(1).employeeName("Amrutha").department("IT").designation("Senior Developer").salary(BigDecimal.valueOf(40000)).build());
       list.add(Employee.builder().employeeId(3).employeeName("Minu").department("IT").designation("Junior Developer").salary(BigDecimal.valueOf(10000)).build());
       list.add(Employee.builder().employeeId(6).employeeName("Chinju").department("IT").designation("Team Lead").salary(BigDecimal.valueOf(80000)).build());


       return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
    }

    @GetMapping("/{empid}")
    public ResponseEntity<List<Employee>> getEmployeebyID(@PathVariable Integer empid)
    {
        List<Employee> e=list.stream().filter(emp->emp.getEmployeeId().equals(empid)).collect(Collectors.toList());
        return new ResponseEntity<List<Employee>>(e, HttpStatus.OK);
    }
}
