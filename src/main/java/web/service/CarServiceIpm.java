package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceIpm implements CarService {

    private static int cars_counte;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++cars_counte,"Opel","Insignia"));
        cars.add(new Car(++cars_counte,"Nissan","Juke"));
        cars.add(new Car(++cars_counte,"Toyota","Tundra"));
        cars.add(new Car(++cars_counte,"VolksWagen","Golf"));
        cars.add(new Car(++cars_counte,"Mazda","RX-8"));

    }

    @Override
    public List<Car> carsList() {
        return cars;
    }


    @Override
    public List<Car> showCars(int counte) {

        if (counte > 5 || counte == 5) {
            return cars;
        }

        List<Car> someCars = new ArrayList<>();

        for (int y = 0; y < counte; y++) {
            someCars.add(cars.get(y));
        }

        return someCars;

    }
}
