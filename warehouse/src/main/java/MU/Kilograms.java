package MU;

public class Kilograms extends MeasurableUnit {
    private int quantity;

    public Kilograms(String unitName,int quantity) {
        super(unitName);
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Kilograms{" +
                "quantity=" + quantity +
                '}';
    }
}
