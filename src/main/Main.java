package main;

import utils.pojo.Bobby;
import utils.pojo.MyPoint;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by cretu on 12/12/2016.
 */
public class Main {
    public static void main(String argc[]) throws FileNotFoundException {
        System.out.println("Test");


        double x,y;
        Scanner sc = new Scanner(System.in);
        x=sc.nextDouble();
        y=sc.nextDouble();

        Bobby theProblem = new Bobby(x,y);

        // theProblem.setThirdPoint(new MyPoint(x,y));

        //theProblem.makeTriagles();
    }
}
