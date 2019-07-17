package Products;

import MU.MeasurableUnit;

import java.util.Date;

public class Product {


    private String name;
    private int pricePerUnit;
    private Date expirationDate;
    private Date creationDate;
    private MeasurableUnit mu;

    public Product(String name, int pricePerUnit, Date expirationDate, Date creationDate, MeasurableUnit mu) {
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

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Date getCreationDate() {
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

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setMu(MeasurableUnit mu) {
        this.mu = mu;
    }


}
