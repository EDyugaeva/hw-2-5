package pro.sky.java.course2.hw25.services;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Set<String> employeesSet;

    public EmployeeServiceImpl() {
        employeesSet = new HashSet<>();
    }


    public boolean addEmployee(String firstName, String lastName) {
        return employeesSet.add(firstName + " " + lastName);
    }

    @Override
    public boolean removeEmployee(String firstName, String lastName)  {
        return employeesSet.remove(firstName + " " + lastName);

    }

    @Override
    public Set<String> getSet ()  {
        return employeesSet;
    }



}


