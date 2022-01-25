package pro.sky.java.course2.hw25.services;


import pro.sky.java.course2.hw25.Employee;
import pro.sky.java.course2.hw25.exceptions.EmployeeNotFoundException;

import java.util.Set;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException;
    Set<Employee> getSet();


}
