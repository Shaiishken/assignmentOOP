package src.model;
import java.math.BigDecimal;
public class Car {
    private String name;
    private String engine_Type;
    private BigDecimal price;
    private int production_Year;
    public Car(String name, String engine_Type, BigDecimal price, int production_Year) {
        this.name = name; this.engine_Type = engine_Type; this.price = price; this.production_Year = production_Year;
    }
    @Override public String toString() { return "Car{name='" + name + "', engine_Type='" + engine_Type + "', price=" + price + ", year=" + production_Year + "}"; }
}