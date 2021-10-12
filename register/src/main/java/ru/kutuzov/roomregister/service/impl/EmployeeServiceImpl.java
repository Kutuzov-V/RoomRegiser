package ru.kutuzov.roomregister.service.impl;

import org.springframework.stereotype.Service;
import ru.kutuzov.roomregister.repository.Employee;
import ru.kutuzov.roomregister.repository.dto.EmployeeDto;
import ru.kutuzov.roomregister.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployee(Integer id) {
        return new EmployeeDto(id,"Some Test Name",
                "Some test surname",
                "Grand master", "RealMan73","ab367ffe");
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
        return List.of(new EmployeeDto(1, "Some Test Name",
                        "Some test surname",
                        "Grand master", "RealMan73", "ab367ffe"),
                new EmployeeDto(2, "Some Test Name 1",
                        "Some test surname 1",
                        "Crazy Admin", "whoIsDaddy", "4567aacc"),
                new EmployeeDto(3, "Some Test Name 2",
                        "Some test surname 2",
                        "Beauty Girl", "Beautiful", "123aacc")
        );
    }

    @Override
    public String createEmployee(String firstName, String surName, String Post, String login, String pass) {
        return "Employee " + firstName + " " + surName + "" + "is created";
    }

    @Override
    public String deleteEmployee(Integer id) {
        return  "Employee with id: " + id + "successfully deleted";
    }

    @Override
    public boolean authorizeEmployee(String login, Integer passHash) {
        if(login.equals("Admin") && passHash==1){
            return true;
        }else return false;
    }
}
