package interfaces;

import utils.pojo.MyPoint;

import java.util.ArrayList;

/**
 * Created by cretu on 12/12/2016.
 */
public interface SortedPoints {

    public ArrayList<MyPoint> arrayList = null;
    public void sortPoints(ArrayList<MyPoint> myPointArrayList);
    public ArrayList<MyPoint> getSortedPoints();

}
