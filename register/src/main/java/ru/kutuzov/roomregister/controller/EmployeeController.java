package ru.kutuzov.roomregister.controller;

import org.springframework.web.bind.annotation.*;
import ru.kutuzov.roomregister.repository.dto.AauthorizeEmployeeDto;
import ru.kutuzov.roomregister.repository.dto.EmployeeDto;
import ru.kutuzov.roomregister.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployees(){
        return employeeService.getAllEmployee();
    }



    @GetMapping("/{id}")
    public EmployeeDto getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        return employeeService.deleteEmployee(id);
    }

    @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeDto;
    }

    @PutMapping
    public String authorizeEmployee(@RequestBody AauthorizeEmployeeDto auth){
        if(employeeService.authorizeEmployee(auth.getLogin(),auth.getPassHash())) {
            return "Authentication is successful";
        }else return "Bad login or password";
    }



}
