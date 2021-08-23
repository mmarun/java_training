package com.javatutorials.springWebDemo.Controller;

import com.javatutorials.springWebDemo.EmployeeModel.Employee;
import org.apache.catalina.LifecycleState;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/employees")
@RestController
public class EmployeeController {

   /* @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId){
        Employee employee=Employee.builder().employeeId(employeeId).empName("Sanju").empDept("R&D").salary(BigDecimal.valueOf(50000)).build();

        return employee;
    }*/
   @GetMapping("/{employeeId}")
   public ResponseEntity<Employee> getEmployee(@PathVariable Integer employeeId){
       Employee employee=Employee.builder().employeeId(employeeId).empName("Sanju").empDept("R&D").salary(BigDecimal.valueOf(50000)).build();

       return new ResponseEntity<>(employee,HttpStatus.OK);
   }

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees(){
        List<Employee> list=new ArrayList<>(2);
        list.add(Employee.builder().employeeId(1).empName("Mathew").empDept("HR").salary(BigDecimal.valueOf(50000)).build());
        list.add(Employee.builder().employeeId(2).empName("Jovina").empDept("Testing").salary(BigDecimal.valueOf(40000)).build());
        return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);


    }
}
