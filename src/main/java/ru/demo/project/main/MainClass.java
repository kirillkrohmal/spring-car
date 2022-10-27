package ru.demo.project.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.demo.project.model.Car;
import ru.demo.project.model.User;
import ru.demo.project.service.CarService;
import ru.demo.project.service.CarServiceImpl;
import ru.demo.project.sql.AppConfig;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CarService carService = context.getBean(CarService.class);

        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("Lada", 3);
        Car car3 = new Car("VW", 4);
        Car car4 = new Car("Ford", 2);


        carService.add(new User("Sergei", "Ivanov", "sergeiIvanov@gmail.com", car1));
        carService.add(new User("Ivan", "Dmitrov", "ivandmitrov@mail.ru", car2));
        carService.add(new User("Vasya", "Petrov", "vasyapetrov@rambler.ru", car3));
        carService.add(new User("Petr", "Genadiev", "petrgenadiev@yandex.ru", car4));



        List<User> users = carService.listUsers();
        for (User user : users) {
            System.out.println("Id = " + user.getId());
            System.out.println("First name = " + user.getFirstName());
            System.out.println("Last name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println("Car = " + user.getCar());
            System.out.println();
        }

        context.close();

    }
}
