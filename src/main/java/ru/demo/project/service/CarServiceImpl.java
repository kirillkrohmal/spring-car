package ru.demo.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demo.project.model.User;
import ru.demo.project.repositories.CarDao;
import ru.demo.project.repositories.CarDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;

    @Transactional
    @Override
    public void add(User user) {
        carDao.add(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return carDao.listUsers();
    }
}
