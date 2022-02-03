package pro.sky.java.course2.hw25.services;

import pro.sky.java.course2.hw25.data.Employee;

import java.util.List;
import java.util.Set;

public interface DepartmentService {
    Employee findEmployeeWithMaxSalaryInDepartment (String department);
    Employee findEmployeeWithMinSalaryInDepartment (String department);
    Set<Employee> findAllEmployeesInDepartment(String department);
    List<Employee> findEmployees();


}
