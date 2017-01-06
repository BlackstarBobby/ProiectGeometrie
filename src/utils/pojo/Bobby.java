package utils.pojo;

import interfaces.SortedPoints;
import interfaces.Triagles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bobby on 03-01-2017.
 */
public class Bobby implements Triagles {

    private ArrayList<MyTriangle> myTriangles=new ArrayList<>();
    private ArrayList<MyPoint> myPoints=new ArrayList<>();
    private MyPoint thirdPoint ;

    public void setThirdPoint(MyPoint thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    @Override
    public void makeTriagles(ArrayList<MyPoint> myPoints, MyPoint thePoint) {
        for (int i=0;i<myPoints.size()-1;i++){
            myTriangles.add(new MyTriangle(thirdPoint,myPoints.get(i),myPoints.get(i+1)));
        }
    }

    public ArrayList<MyTriangle> getMyTriangles() {
        return myTriangles;
    }

    public ArrayList<MyPoint> getMyPoints() {
        return myPoints;
    }

    @Override
    public ArrayList<MyTriangle> getTringles() {  //does not really have a point
        return null;

    }

    @Override
    public double getTrianglesArea(ArrayList<MyTriangle> myPointss) {
        double area=0;

        //pentru triunghiul format de primul punct, ultimul punct
        int j=myPoints.size()-1;

        double xA=myPoints.get(0).getX();
        double yA=myPoints.get(0).getY();
        double xB=myPoints.get(j).getX();
        double yB=myPoints.get(j).getY();
        double xC=thirdPoint.getX();
        double yC=thirdPoint.getY();
        //area+=(1.0/2.0)*Math.abs(xA*yB+xB*yC+xC*yA-xA*yC-xC*yB-xB*yA);
        area+=Math.floor((1.0/2.0)*Math.abs(xA*yB+xB*yC+xC*yA-xA*yC-xC*yB-xB*yA));

        //pentru restul triughiurilor
        for (int i=0;i<myTriangles.size();i++){
             xA=myTriangles.get(i).getMyPoint1().getX();
             yA=myTriangles.get(i).getMyPoint1().getY();
             xB=myTriangles.get(i).getMyPoint2().getX();
             yB=myTriangles.get(i).getMyPoint2().getY();
             xC=myTriangles.get(i).getMyPoint3().getX();
             yC=myTriangles.get(i).getMyPoint3().getY();

            area+=(1.0/2.0)*Math.abs(xA*yB+xB*yC+xC*yA-xA*yC-xC*yB-xB*yA);
        }


        return area;
    }

    public double getPolygonArea(ArrayList<MyPoint> myPoints){
        double area=0;

//        int j=myPoints.size()-1;
//        for (int i=0;i<myPoints.size();i++){
//            area= area+(myPoints.get(j).getX()+myPoints.get(i).getX())*(myPoints.get(j).getY()-myPoints.get(i).getY());
//            j=i;
//        }

        for(int i=1;i<myPoints.size()-1;i++){
            double xA=myPoints.get(0).getX();
            double yA=myPoints.get(0).getY();
            double xB=myPoints.get(i).getX();
            double yB=myPoints.get(i).getY();
            double xC=myPoints.get(i+1).getX();
            double yC=myPoints.get(i+1).getY();

            area+=((1.0/2.0)*Math.abs(xA*yB+xB*yC+xC*yA-xA*yC-xC*yB-xB*yA));
        }

        return area;
    }

    public Bobby(double xx, double yy) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("date.in"));

        while(sc.hasNextInt()){
            myPoints.add(new MyPoint(sc.nextInt(),sc.nextInt()));
        }

        setThirdPoint(new MyPoint(xx,yy));

        makeTriagles(myPoints,thirdPoint);


        //just testing
        if(getPolygonArea(myPoints)==getTrianglesArea(myTriangles)){
            System.out.println("egal");
        }


    }
}
