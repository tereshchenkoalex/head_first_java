package io.github.tereshchenkoalex.chapter1;

public class Loopy {
    public static void main (String[] args) {
        int x = 1;
        System.out.println("Befor the loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
        System.out.println("This is after the loop");
    }
}