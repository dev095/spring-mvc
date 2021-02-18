package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("VOLVO", "S70", "Red"));
        cars.add(new Car("BMW", "X5", "Black"));
        cars.add(new Car("MAZDA", "7", "Green"));
        cars.add(new Car("LADA", "Kalina", "Rusty"));
        cars.add(new Car("AUDI", "8", "Yellow"));

    }

    public List<Car> getCars(Integer count) {
        if ((count == null) || (count >= 5) || (count < 0)) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
//        int id = count != null && count < cars.size() ? count : cars.size();
//        return cars.subList(0, id);
    }
}
