package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> carsList();
    List<Car> showCars(int counte);
}
