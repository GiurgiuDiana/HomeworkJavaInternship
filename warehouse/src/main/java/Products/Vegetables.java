package Products;

import MU.MeasurableUnit;

import java.time.LocalDate;
import java.util.Date;

public class Vegetables extends Natural {
    private String producer;
    public Vegetables(String name, int pricePerUnit, LocalDate expirationDate, LocalDate creationDate, MeasurableUnit mu, int nq) {
        super(name, pricePerUnit, expirationDate, creationDate, mu, nq);
    }

    public Vegetables(String name, int pricePerUnit, LocalDate expirationDate, LocalDate creationDate, MeasurableUnit mu, int nq, String producer) {
        super(name, pricePerUnit, expirationDate, creationDate, mu, nq);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
