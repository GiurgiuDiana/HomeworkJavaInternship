package Products;

import MU.MeasurableUnit;

import java.time.LocalDate;
import java.util.Date;

public class Product {


    private String name;
    private int pricePerUnit;
    private LocalDate expirationDate;
    private LocalDate creationDate;
    private MeasurableUnit mu;

    public Product(String name, int pricePerUnit, LocalDate expirationDate, LocalDate creationDate, MeasurableUnit mu) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.expirationDate = expirationDate;
        this.creationDate = creationDate;
        this.mu = mu;
    }

    public String getName() {
        return name;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public MeasurableUnit getMu() {
        return mu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setMu(MeasurableUnit mu) {
        this.mu = mu;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", expirationDate=" + expirationDate +
                ", creationDate=" + creationDate +
                ", mu=" + mu +
                '}';
    }
}
