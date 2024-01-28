package Recorded;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        float result = (float) Math.PI * radius * radius;
        System.out.println("Area of Circle is: " + result);
        sc.close();
    }
}
