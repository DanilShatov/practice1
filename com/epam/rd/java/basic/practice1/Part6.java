package com.epam.rd.java.basic.practice1;

public class Part6 {
    public static void main(String... args) {
      int a[] = prime(args[0]);
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static int[] prime(String num) {
        int[] arr = new int[Integer.parseInt(num)];
        int tmp = 2;
        for (int i = 0; i < arr.length; i++) {
            while (tmp > 0) {
                if (check(tmp)) {
                    arr[i] = tmp;
                    break;
                }
                tmp++;
            }
            tmp++;
        }
      return arr;
    }

    static boolean check(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
