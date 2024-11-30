package com.employeemvc.Controller;

import com.employeemvc.Entity.Employee;
import com.employeemvc.Service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        //Getting List of all employees from database
        List<Employee> theEmployees = employeeService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "Employee_Pages/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Employee theEmployee = new Employee();
        theModel.addAttribute("employee", theEmployee);

        return "Employee_Pages/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {

        //Save the employee
        employeeService.save(theEmployee);

        //redirect to Employee List
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeID") int theId, Model theModel) {

        //Get the employee from the service
        Employee found = employeeService.findById(theId);

        //Prepopulate the Employee-form by setting the model with employee
        theModel.addAttribute("employee", found);
        //Send over to the Form

        return "Employee_Pages/employee-form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeID") int theId) {
        employeeService.deleteById(theId);
        return "redirect:/employees/list";
    }
}
