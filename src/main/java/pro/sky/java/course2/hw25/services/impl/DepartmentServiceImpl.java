package pro.sky.java.course2.hw25.services.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import pro.sky.java.course2.hw25.data.Employee;
import pro.sky.java.course2.hw25.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.hw25.services.DepartmentService;
import pro.sky.java.course2.hw25.services.EmployeeService;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService  {
    private final EmployeeService employeeService;
    private final Set<Employee> employees;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.employees = employeeService.getSet();
    }


    @Override
    public Employee findEmployeeWithMaxSalaryInDepartment(String department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .max(Comparator.comparing(employee -> employee.getSalary()))
                .orElseThrow(() -> new EmployeeNotFoundException("Сотрудников нет"));
    }

    @Override
    public Employee findEmployeeWithMinSalaryInDepartment(String department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .min(Comparator.comparing(employee -> employee.getSalary()))
                .orElseThrow(() -> new EmployeeNotFoundException("Сотрудников нет"));
    }

    @Override
    public Set<Employee> findAllEmployeesInDepartment(String department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toSet());
    }

    @Override
    public List<Employee> findEmployees() {
        return employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getDepartment()))
                .collect(Collectors.toList());

    }
}
