package interfaces;

import utils.pojo.MyPoint;
import utils.pojo.MyTriangle;

import java.util.ArrayList;

/**
 * Created by cretu on 12/12/2016.
 */
public interface Triagles {
    public void makeTriagle(ArrayList<MyPoint> myPoints);
    public ArrayList<MyTriangle> getTringle();
}
