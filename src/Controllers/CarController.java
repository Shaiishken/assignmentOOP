package controller;
import model.Car;
import service.CarService;
import java.util.List;
public class CarController {
    private final CarService carService = new CarService();
    public void addCar(Car car) { carService.addCar(car); }
    public void listAllCars() { List<Car> cars = carService.getAllCars(); cars.forEach(System.out::println); }
}