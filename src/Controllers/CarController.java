package Controllers;
import Model.Car;
import Service.CarService;
import java.util.List;
public class CarController {
    private final CarService carService = new CarService();
    public void addCar(Car car) { carService.addCar(car); }
    public void listAllCars() { List<Car> cars = carService.getAllCars(); cars.forEach(System.out::println); }
}