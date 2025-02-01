import controller.FactoryController;
import java.math.BigDecimal;
import java.util.Scanner;
import config.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

    public static void main(String[] args) throws SQLException {

        System.out.println("Starting Car Factory Application...");

        // Test database connection
        Connection conn = DatabaseConnection.getConnection(); {
            if (conn != null) {
                System.out.println("Successfully connected to PostgreSQL database!");
            } else {
                System.out.println("Failed to connect to PostgreSQL.");
            }
        }
        
        FactoryController factoryController = new FactoryController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Car Factory Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Car Producing Machine");
            System.out.println("3. Add Car");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    String empName = scanner.next();
                    System.out.print("Enter Employee Position: ");
                    String position = scanner.next();
                    System.out.print("Enter Employee Salary: ");
                    BigDecimal salary = scanner.nextBigDecimal();
                    factoryController.addEmployee(empName, position, salary);
                    insertData(conn, "INSERT INTO employees (name, position, salary) VALUES ('" + empName + "', '" + position + "', " + salary + ")");
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Machine Name: ");
                    String machine_Name = scanner.next();
                    System.out.print("Enter Production Capacity: ");
                    int capacity = scanner.nextInt();
                    System.out.print("Is Operational (true/false): ");
                    boolean operational = scanner.nextBoolean();
                    factoryController.addMachine(machine_Name, capacity, operational);
                    insertData(conn, "INSERT INTO machines (machine_Name, capacity, operational) VALUES ('" + machine_Name + "', '" + capacity + "', " + operational + ")" );
                    System.out.println("Machine added successfully.");
                    break;
                case 3:
                    System.out.print("Enter Car Name: ");
                    String name = scanner.next();

                    System.out.print("Enter type of engine: ");
                    String engine_Type = scanner.next();


                    System.out.print("Enter Car price: ");
                    BigDecimal price = scanner.nextBigDecimal();

                    System.out.print("Year of Production: ");
                    int production_Year = scanner.nextInt();

                    factoryController.addCar(name, engine_Type, price, production_Year);
                    insertData(conn, "INSERT INTO cars (name, engine_Type, price, production_Year) \n" +
                            "VALUES ('" + name + "', '" + engine_Type + "', " + price + ", '" + production_Year + "')");
                    System.out.println("Car added successfully.");
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void insertData(Connection conn, String sql) {
        try (Statement stmt = conn.createStatement()) {
            int rowsInserted = stmt.executeUpdate(sql);
            if (rowsInserted > 0) {
                System.out.println("✅ Insert successful: " + sql);
            } else {
                System.out.println("❌ Insert failed: " + sql);
            }
        } catch (SQLException e) {
            System.out.println("❌ SQL Error: " + e.getMessage());
        }
    }

}