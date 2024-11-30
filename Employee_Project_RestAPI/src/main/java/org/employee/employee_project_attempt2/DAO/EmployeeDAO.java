package org.employee.employee_project_attempt2.DAO;

import org.employee.employee_project_attempt2.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int id);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
