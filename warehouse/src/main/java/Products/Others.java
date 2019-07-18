package Products;

import MU.MeasurableUnit;

import java.time.LocalDate;
import java.util.Date;

public class Others extends Product {
    public Others(String name, int pricePerUnit, LocalDate expirationDate, LocalDate creationDate, MeasurableUnit mu) {
        super(name, pricePerUnit, expirationDate, creationDate, mu);
    }
}
