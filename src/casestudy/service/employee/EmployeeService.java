package casestudy.service.employee;

import casestudy.entity.Employee;
import casestudy.repository.employee.EmployeeRepository;
import casestudy.repository.employee.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAllEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee);
    }

    @Override
    public Employee searchId(String id) {
       return employeeRepository.searchId(id);
    }
}
