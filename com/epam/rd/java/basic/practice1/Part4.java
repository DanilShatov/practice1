package com.epam.rd.java.basic.practice1;

public class Part4 {
    public static void main(String... args) {
        System.out.println(average(args[0],args[1]));
    }

    public static double average(String a,String b) {
    double x = Double.parseDouble(a);
    double y = Double.parseDouble(b);

    double average = (x+y)/2;
        return average;
    }
}
