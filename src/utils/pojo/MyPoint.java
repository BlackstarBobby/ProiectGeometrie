package utils.pojo;

/**
 * Created by Cretu Calin on 11/13/2016.
 */
public class MyPoint {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "utils.pojo.MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
