package org.employee.employee_project_attempt2.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.employee.employee_project_attempt2.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

    //Define Field for entitymanager
private EntityManager entityManager;

    //setup constructor injection

    @Autowired
    public EmployeeDAOImplementation(EntityManager theentityManager){
    this.entityManager = theentityManager;
}

    @Override
    public List<Employee> getAllEmployee() {
        TypedQuery<Employee> querry = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employeeList = querry.getResultList();
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee updatedEmployee = entityManager.merge(employee);

        return updatedEmployee;
    }

    @Override
    public void deleteEmployee(int id) {
        entityManager.remove(entityManager.find(Employee.class, id));
    }
}
