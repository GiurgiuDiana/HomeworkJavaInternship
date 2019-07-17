package Products;

import MU.MeasurableUnit;

import java.util.Date;

public class Others extends Product {
    public Others(String name, int pricePerUnit, Date expirationDate, Date creationDate, MeasurableUnit mu) {
        super(name, pricePerUnit, expirationDate, creationDate, mu);
    }
}
