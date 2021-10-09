package ru.kutuzov.roomregister.service;

import ru.kutuzov.roomregister.repository.Employee;
import ru.kutuzov.roomregister.repository.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    public EmployeeDto getEmployee(Integer id);
    public List<Employee> getAllEmployee();
    public String createEmployee(String firstName, String surName, String Post, String login, String pass);
    public String deleteEmployee(Integer id);
    public boolean authorizeEmployee(String login,Integer passHash);

}
