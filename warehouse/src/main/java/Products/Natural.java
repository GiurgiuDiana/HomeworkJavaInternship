package Products;

import MU.MeasurableUnit;

import java.time.LocalDate;
import java.util.Date;

public class Natural extends Product {
    private int nutritonalQuality;
    public Natural(String name, int pricePerUnit, LocalDate expirationDate, LocalDate creationDate, MeasurableUnit mu, int nq) {
        super(name, pricePerUnit, expirationDate, creationDate, mu);
        this.nutritonalQuality=nq;
    }

    public int getNutritonalQuality() {
        return nutritonalQuality;
    }

    public void setNutritonalQuality(int nutritonalQuality) {
        this.nutritonalQuality = nutritonalQuality;
    }

}
