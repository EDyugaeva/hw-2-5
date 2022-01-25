package pro.sky.java.course2.hw25.services;


import pro.sky.java.course2.hw25.Employee;
import pro.sky.java.course2.hw25.exceptions.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    String removeEmployee(int index);
    Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException;
    List<Employee> getSet();


}
