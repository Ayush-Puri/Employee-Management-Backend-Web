package org.employee.employee_project_attempt2.Controller;

import org.employee.employee_project_attempt2.Entity.Employee;
import org.employee.employee_project_attempt2.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeServiceImpl employeeServiceImpl;
    //Field
    //Quick and Dirty

    @Autowired//Constructor
    public EmployeeRestController(EmployeeServiceImpl theemployeeService) {
        this.employeeServiceImpl = theemployeeService;
    }
    //Expose "/employee" endpoint to list out all employees

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeServiceImpl.getAllEmployee();
    }


    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee employee =  employeeServiceImpl.getEmployeeById(id);

        if(employee == null){
            throw new RuntimeException("Employee Not Found "+id);
        }

        return employee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setEmployeeId(0);
        Employee savedEmployee = employeeServiceImpl.updateEmployee(employee);
        return savedEmployee;
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeServiceImpl.updateEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee tobeDeleted = employeeServiceImpl.getEmployeeById(id);
        if(tobeDeleted == null){
            throw new RuntimeException("Employee Not Found "+id);
        }
        employeeServiceImpl.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }

}
