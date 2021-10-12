package ru.kutuzov.roomregister.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import ru.kutuzov.roomregister.repository.Employee;

@Getter
public class AauthorizeEmployeeDto extends Employee {
    private String login;
    private Integer passHash;

    public AauthorizeEmployeeDto(@JsonProperty("login") String login, @JsonProperty("passHash") Integer passHash) {
        //потом надо будет придумать способ вытаскивать id из БД по существующему логину
        super(1);
        this.login =login;
        this.passHash = passHash;
    }
}
