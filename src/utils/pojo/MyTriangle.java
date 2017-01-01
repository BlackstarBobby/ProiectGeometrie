package utils.pojo;

import utils.pojo.MyPoint;

/**
 * Created by cretu on 12/12/2016.
 */
public class MyTriangle {

    private MyPoint myPoint1;
    private MyPoint myPoint2;

    public MyPoint getMyPoint1() {
        return myPoint1;
    }

    public void setMyPoint1(MyPoint myPoint1) {
        this.myPoint1 = myPoint1;
    }

    @Override
    public String toString() {
        return "utils.pojo.MyTriangle{" +
                "myPoint1=" + myPoint1 +
                ", myPoint2=" + myPoint2 +
                ", myPoint3=" + myPoint3 +
                '}';
    }

    public MyPoint getMyPoint2() {
        return myPoint2;
    }

    public void setMyPoint2(MyPoint myPoint2) {
        this.myPoint2 = myPoint2;
    }

    public MyPoint getMyPoint3() {
        return myPoint3;
    }

    public void setMyPoint3(MyPoint myPoint3) {
        this.myPoint3 = myPoint3;
    }

    public MyTriangle(MyPoint myPoint1, MyPoint myPoint2, MyPoint myPoint3) {
        this.myPoint1 = myPoint1;
        this.myPoint2 = myPoint2;
        this.myPoint3 = myPoint3;

    }

    private MyPoint myPoint3;

}
