package ru.kutuzov.roomregister.repository.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.kutuzov.roomregister.repository.Employee;

import lombok.Getter;

@Getter
public class EmployeeDto extends Employee {
    private String name;
    private String surName;
    private String post;
    private String login;
    private String passHash;

    public EmployeeDto(@JsonProperty("emloyeeId") Integer employeeId,
                       @JsonProperty("name") String name,
                       @JsonProperty("surName") String surName,
                       @JsonProperty("post") String post,
                       @JsonProperty("login") String login,
                       @JsonProperty("passHash") String passHash) {
        super(employeeId);
        this.name = name;
        this.surName = surName;
        this.post = post;
        this.login = login;
        this.passHash = passHash;
    }
}
