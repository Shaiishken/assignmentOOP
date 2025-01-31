package repository;
import model.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeRepository {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public Connection connect() throws SQLException { return DriverManager.getConnection(URL, "postgres", "password"); }
    public void addEmployee(Employee emp) { /* Insert logic */ }
    public List<Employee> getAllEmployees() { return new ArrayList<>(); }
}