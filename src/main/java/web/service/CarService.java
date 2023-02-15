package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("model1", "black", 1997));

        cars.add(new Car("model2", "white", 2007));

        cars.add(new Car("model3", "red", 2015));

        cars.add(new Car("model4", "green", 2003));

        cars.add(new Car("model5", "blue", 2013));
    }


    public List<Car> getAllCars() {
        return cars;
    }


    public List<Car> getCarList(int count) {

        return (count >= 0) ? cars.stream().limit(count).collect(Collectors.toList()) : cars;
    }

}


