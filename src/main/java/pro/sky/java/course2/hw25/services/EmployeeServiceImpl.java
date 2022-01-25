package pro.sky.java.course2.hw25.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.hw25.Employee;
import pro.sky.java.course2.hw25.exceptions.EmployeeNotFoundException;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Set<Employee> employeesSet;

    public EmployeeServiceImpl() {
        employeesSet = new HashSet<>();
    }


    public Employee addEmployee(String firstName, String lastName) {
        Employee addedEmployee = new Employee(firstName, lastName);
        employeesSet.add(addedEmployee);
        return addedEmployee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee removedEmployee = new Employee(firstName, lastName);
        if (employeesSet.contains(removedEmployee)) {
            employeesSet.remove(removedEmployee);
            return removedEmployee;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");

    }

    @Override
    public Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        Employee findingEmployee = new Employee(firstName, lastName);
        if (employeesSet.contains(findingEmployee))
            return findingEmployee;
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }


    @Override
    public Set<Employee> getSet() {
        return employeesSet;
    }


}


