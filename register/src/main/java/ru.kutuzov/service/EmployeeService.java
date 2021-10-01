package ru.kutuzov.service;

import ru.kutuzov.repository.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee getEmployee(int id);
    public List<Employee> getAllEmployee();
    public String createEmployee(String firstName, String surName, String Post, String login, String pass);
    public String deleteEmployee(int id);
    public boolean authorizeEmployee(String login,int passHash);

}
