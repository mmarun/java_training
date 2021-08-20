package com.javatutorials.springWebDemo.controller;

import com.javatutorials.springWebDemo.model.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    /**
     * Returns a specific employee..
     * @param employeeId
     * @return
     */
    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer employeeId){
        Employee employee = Employee.builder().employeeId(employeeId).employeeName("ABC").department("R&D")
                .designation("Senior Analyst").salary(BigDecimal.valueOf(40000)).build();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    /**
     * Returns all employees..
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> list = new ArrayList<>(2);
        list.add(Employee.builder().employeeId(1).employeeName("ABC").department("R&D")
                .designation("Senior Analyst").salary(BigDecimal.valueOf(40000)).build());

        list.add(Employee.builder().employeeId(2).employeeName("XYX").department("R&D")
                .designation("Junior Analyst").salary(BigDecimal.valueOf(25000)).build());
        return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> postEmployee(@RequestBody Employee employee){
        Integer id = Double.valueOf(Math.random() * 100).intValue();
        employee.setEmployeeId(id);
        ResponseEntity<Employee> emp =  new ResponseEntity<>(employee, HttpStatus.CREATED);
        //emp.getHeaders().add("location", "http://localhost:8087/employees/" + id);
        return emp;
    }
}
