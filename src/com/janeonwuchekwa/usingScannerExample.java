package com.janeonwuchekwa;

import java.util.Scanner;

public class usingScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x value:");
        int x = scanner.nextInt();

        System.out.println("Enter y value:");

        int y = scanner.nextInt();

        if(x<y) {
            System.out.println("y is greater than x");
        }else{
            System.out.println("x is greater");
        }

    }
}
