package casestudy.repository.employee;

import casestudy.entity.Employee;
import casestudy.util.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_FILE = "src/casestudy/data/employee.csv";
    public static List<Employee> employees = new ArrayList<>();
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadWriteFile.readFile(EMPLOYEE_FILE);
        String[] arr;
        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            Employee employee = new Employee(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],Long.parseLong(arr[9]));
            employeeList.add(employee);
        }
        return employeeList;

    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInForToFileEmployee());
        ReadWriteFile.writeFile(EMPLOYEE_FILE,stringList,APPEND);
    }

    @Override
    public void updateEmployee(Employee employee) {
        List<Employee> employeeList = findAllEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMa().equals(employee.getMa())){
                employeeList.set(i,employee);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList){
            stringList.add(e.getInForToFileEmployee());
        }
        ReadWriteFile.writeFile(EMPLOYEE_FILE,stringList,NOT_APPEND);
    }

    @Override
    public Employee searchId(String id) {
        List<Employee> employeeList = findAllEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if ((employeeList.get(i).getMa()).equals(id)){
                return employeeList.get(i);
            }
        }
        return null;
    }
}
