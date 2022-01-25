package pro.sky.java.course2.hw25.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hw25.Employee;
import pro.sky.java.course2.hw25.exceptions.EmployeeArrayIndexOutOfBounds;
import pro.sky.java.course2.hw25.services.EmployeeService;

import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping( "/add")
    public boolean getEmployee(@RequestParam String firstName,
                                @RequestParam String lastName)  {
       return employeeService.addEmployee(firstName, lastName);


    }
    @GetMapping( "/remove")
    public boolean removeEmployee(@RequestParam String firstName,
                              @RequestParam String lastName)  {
        return employeeService.removeEmployee(firstName, lastName);


    }

    @GetMapping( "/get")
    public Set<String> getSet() {
        return employeeService.getSet();


    }



}
