package ru.kutuzov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RoomRegisterApp {
    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(RoomRegisterApp.class);
        System.out.println("hello mafaka");

    }
}
