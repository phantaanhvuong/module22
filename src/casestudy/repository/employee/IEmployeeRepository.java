package casestudy.repository.employee;

import casestudy.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAllEmployee();
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    Employee searchId(String id);
}
