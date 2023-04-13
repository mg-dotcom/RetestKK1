package quantity.id120;

public class Measure {
    private double value;
    private final String unit;

    public Measure(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Measure { " +
                "value = " + value + " " + getUnit() +
                " , unit = '" + unit + '\'' + " }";
    }

}
