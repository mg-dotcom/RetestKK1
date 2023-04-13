import quantity.id120.Measure;
import thing.id120.Dimension;

public class Main {
    public static void main(String[] args) {
        testHeightAndNewHeight();
    }

    public static void testHeightAndNewHeight(){
        System.out.println("Old Height ----------------------");
        Measure measure = new Measure(168.8,"CM");
        System.out.println(measure.toString());

        System.out.println("New Height ----------------------");
        Measure height = new Measure(168.8,"CM");
        Measure width = new Measure(25.3,"CM");

        Dimension d = new Dimension("MG",height,width);
        System.out.println(d.toString());

        d.changeHeight(180.2);
        System.out.println("Show Value: " +d.getHeightValue());
        System.out.println("Show Unit: " +d.getHeightUnit());
    }

}