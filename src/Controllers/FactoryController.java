package controller;
import model.Employee;
import model.Car;
import model.CarProducingMachine;
import service.CarService;
import service.EmployeeService;
import service.MachineService;
import java.math.BigDecimal;
public class FactoryController {
    private final EmployeeService empService = new EmployeeService();
    private final MachineService machineService = new MachineService();
    private final CarService carService = new CarService();

    public void addEmployee(String name, String position, BigDecimal salary) {
        empService.addEmployee(new Employee(0, name, position, salary));
    }
    public void addMachine(String name, int capacity, boolean operational) {
        machineService.addMachine(new CarProducingMachine(0, name, capacity, operational));
    }
    public void addCar(String name, String engine_Type, BigDecimal price, int production_Year) {
        carService.addCar(new Car(name, engine_Type, price, production_Year));
    }
}