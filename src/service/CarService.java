package service;
import model.Car;
import repository.CarRepository;

import java.util.List;

public class CarService {
    private final CarRepository carRepo = new CarRepository();
    public void addCar(Car car) { carRepo.addCar(car); };

    public List<Car> getAllCars() {

        return List.of();
    }
}