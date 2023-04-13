package thing.id120;

import quantity.id120.Measure;

public class Dimension {
    private String title;
    private final Measure height;
    private final Measure width;

    public Dimension(String title, Measure height, Measure width) {
        this.title = title;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Dimension {" +
                "title='" + title + '\'' +
                ", height=" + getHeightValue() + " " + getHeightUnit() +
                ", width=" + width.getValue() + " " + width.getUnit() +
                '}';
    }

    public void changeHeight(double newHeight) {
        height.setValue(newHeight);
    }

    public String getHeightUnit(){
        return height.getUnit();
    }

    public double getHeightValue(){
        return height.getValue();
    }

}
