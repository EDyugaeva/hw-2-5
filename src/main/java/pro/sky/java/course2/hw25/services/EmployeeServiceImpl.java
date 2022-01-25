package pro.sky.java.course2.hw25.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.hw25.Employee;
import pro.sky.java.course2.hw25.exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList;

    public EmployeeServiceImpl() {
        employeeList = new ArrayList<>();

    }


    public Employee addEmployee(String firstName, String lastName) {
        Employee addedEmployee = new Employee(firstName, lastName);
        employeeList.add(addedEmployee);
        return addedEmployee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee removedEmployee = new Employee(firstName, lastName);
        if (employeeList.contains(removedEmployee)) {
            employeeList.remove(removedEmployee);
            return removedEmployee;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    public String removeEmployee(int index) {

        employeeList.remove(index);
        return "Сотрудник под индексом " + index + " удален";

    }

    @Override
    public Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        Employee findingEmployee = new Employee(firstName, lastName);
        if (employeeList.contains(findingEmployee))
            return findingEmployee;
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }


    @Override
    public List<Employee> getSet() {
        return employeeList;
    }


}


