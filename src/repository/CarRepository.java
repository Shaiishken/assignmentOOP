package repository;
import model.Car;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class CarRepository {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public Connection connect() throws SQLException { return DriverManager.getConnection(URL, "postgres", "password"); }
    public void addCar(Car car) { /* Insert logic */ }
    public List<Car> getAllCars() { return new ArrayList<>(); }
}