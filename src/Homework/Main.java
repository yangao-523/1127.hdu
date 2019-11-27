package Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int aa = 0;
            for (int i = m; i <= n; i++) {
                int a = i / 100;
                int b = i / 10 % 10;
                int c = i % 10;
                if (a * a * a + b * b * b + c * c * c == i) {
                    if (aa == 0) {
                        System.out.print(i);
                        aa++;
                    } else {
                        System.out.print(" " + i);
                    }
                }
            }
            System.out.println();

            if (aa == 0) {
                System.out.println("no");
            }
        }
    }

}


