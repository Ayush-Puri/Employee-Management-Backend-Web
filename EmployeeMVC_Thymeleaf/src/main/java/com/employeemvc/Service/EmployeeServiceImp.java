package com.employeemvc.Service;

import com.employeemvc.DAO.EmployeeRepository;
import com.employeemvc.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImp implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImp(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }


    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }


    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }


    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
