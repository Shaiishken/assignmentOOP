package src.model;
public class CarProducingMachine {
    private int id;
    private String machineName;
    private int capacity;
    private boolean operational;
    public CarProducingMachine(int id, String machineName, int capacity, boolean operational) {
        this.id = id; this.machineName = machineName; this.capacity = capacity; this.operational = operational;
    }
    @Override public String toString() { return "Machine{id=" + id + ", machineName='" + machineName + "', capacity=" + capacity + ", operational=" + operational + "}"; }
}