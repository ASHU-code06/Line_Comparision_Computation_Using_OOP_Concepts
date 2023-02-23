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

        System.out.println("Enter x2 and y2 co-ordinate for line 1 ");
        double x2 = myinput.nextDouble();
        double y2 = myinput.nextDouble();

        double len1 ;
        len1=Math.sqrt(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)))  ;
        System.out.println("length of line 1 is   "+len1);

        System.out.println("Enter x1 and y1 co-ordinate for line 2 ");
        double a1 = myinput.nextDouble();
        double b1 = myinput.nextDouble();

        System.out.println("Enter x2 and y2 co-ordinate for line 2 ");
        double a2 = myinput.nextDouble();
        double b2 = myinput.nextDouble();

        double len2 ;
        len2=Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2)) ;
        System.out.println("length of line 2 is   "+len2);

        checkIfEquals(len1,len2);
    }
    void checkIfEquals(double len1 , double len2) {
        if(len1==len2){
            System.out.println("The lines are equal");
        } else if (len1>len2) {
            System.out.println("The line1 is greater");
        } else if (len2>len1) {
            System.out.println("The line2 is greater");
        }
    }
}
