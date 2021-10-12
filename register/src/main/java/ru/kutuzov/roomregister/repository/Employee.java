package ru.kutuzov.roomregister.repository;

import lombok.Getter;

@Getter
public class Employee {
    private final Integer employeeId;


    public Employee(Integer employeeId) {
        this.employeeId = employeeId;

    }

}
