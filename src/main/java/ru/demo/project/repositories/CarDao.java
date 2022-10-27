package ru.demo.project.repositories;


import org.springframework.stereotype.Repository;
import ru.demo.project.model.Car;

import org.springframework.data.repository.CrudRepository;
import ru.demo.project.model.User;

import java.util.List;


public interface CarDao {
    void add(User user);
    List<User> listUsers();

}
