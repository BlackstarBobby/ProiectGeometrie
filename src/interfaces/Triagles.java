package interfaces;

import utils.pojo.MyPoint;
import utils.pojo.MyTriangle;

import java.util.ArrayList;

/**
 * Created by cretu on 12/12/2016.
 */
public interface Triagles {
    //public void makeTriagles(ArrayList<MyPoint> myPoints);
    public void makeTriagles(ArrayList<MyPoint> myPoints, MyPoint thePoint);
    public ArrayList<MyTriangle> getTringles();

    public double getTrianglesArea(ArrayList<MyTriangle> myPoints);
}


