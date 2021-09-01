package com.epam.rd.java.basic.practice1;

public class Demo {
    public static void main(String[] args) {
        System.out.print("Part1: ");
        new Part1().main("Hello, World");

        System.out.print("Part2: ");
        new Part2().main("2", "4", "7");

        System.out.print("Part3: ");
        new Part3().main("command", "line", "parameters");

        System.out.print("\nPart4: ");
        new Part4().main("6", "7");

        System.out.print("Part5: ");
        new Part5().main("3568");

        System.out.print("Part6: ");
        new Part6().main("20");

        System.out.print("\nPart7: ");
        new Part7().main("1", "AA", "Z");

    }
}
