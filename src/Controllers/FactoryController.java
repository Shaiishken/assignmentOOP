package Controllers;
import src.model.Employee;
import src.model.Car;
import src.model.CarProducingMachine;
import src.service.CarService;
import src.service.EmployeeService;
import src.service.MachineService;
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
    public void addCar(int id,String name, String engineType, BigDecimal price, int productionYear) {
        carService.addCar(new Car(0, name, engineType, price, productionYear));
    }
}