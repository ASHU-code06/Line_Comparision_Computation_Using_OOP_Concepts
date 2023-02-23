package com.linecomputeusingoop;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparision obj = new LineComparision();
        obj.LineLength();
    }
    void LineLength(){
        //Java Program To Check the length of line
        Scanner myinput = new Scanner(System.in);

        System.out.println("Enter x1 and y1 co-ordinate for line 1 ");
        double x1 = myinput.nextDouble();
        double y1 = myinput.nextDouble();
        System.out.print("Entered value of x1 and y1 co-ordinates for line 1 are " +x1);
        System.out.print(" and "+y1);
        System.out.println(" respectively");

        System.out.println("Enter x2 and y2 co-ordinate for line 1 ");
        double x2 = myinput.nextDouble();
        double y2 = myinput.nextDouble();

        System.out.print("Entered value of x2 and y2 co-ordinates for line 1 are " +x2);
        System.out.print(" and "+y2);
        System.out.println(" respectively");
        System.out.println("Now let's calculate length of line 1" );
        double len ;
        len=Math.sqrt(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2))) ;
        System.out.println("Length of line in cartesian system is  "+len+" units" );
    }
}
