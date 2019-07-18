package MU;

public abstract class MeasurableUnit {

    private String unitName;

    public MeasurableUnit(String unitName) {
        this.unitName = unitName;

    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "MeasurableUnit{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
