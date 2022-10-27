package ru.demo.project.service;

import org.springframework.stereotype.Service;
import ru.demo.project.model.User;

import java.util.List;

public interface CarService {
    void add(User user);
    List<User> listUsers();
}
