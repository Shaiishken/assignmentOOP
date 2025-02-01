package repository;
import model.CarProducingMachine;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class CarProducingMachineRepository {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public Connection connect() throws SQLException { return DriverManager.getConnection(URL, "postgres", "password"); }
    public void addMachine(CarProducingMachine machine) { /* Insert logic */ }
    public List<CarProducingMachine> getAllMachines() { return new ArrayList<>(); }
}