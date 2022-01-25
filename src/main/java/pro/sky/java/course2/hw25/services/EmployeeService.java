package pro.sky.java.course2.hw25.services;


import pro.sky.java.course2.hw25.Employee;
import pro.sky.java.course2.hw25.exceptions.EmployeeArrayIndexOutOfBounds;

import java.util.Set;

public interface EmployeeService {
    boolean addEmployee(String firstName, String lastName);
    boolean removeEmployee(String firstName, String lastName);
    Set<String> getSet();


}
