package com.epam.rd.java.basic.practice1;

public class Part2 {
    public static void main(String... args) {
        int s = 0;
        for (int i = 0; i < args.length; i++) {
            s+=Integer.parseInt(args[i]);
        }
        System.out.println(s);
    }
}
