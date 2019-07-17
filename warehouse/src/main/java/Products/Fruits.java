package Products;

import MU.MeasurableUnit;
import Products.Natural;

import java.util.Date;

public class Fruits extends Natural {
    public Fruits(String name, int pricePerUnit, Date expirationDate, Date creationDate, MeasurableUnit mu, int nq) {
        super(name, pricePerUnit, expirationDate, creationDate, mu, nq);
    }
}
