package Recorded;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        short number1 = sc.nextShort();
        System.out.print("Enter Number 2: ");
        short number2 = sc.nextShort();
        short sum = (short) (number1 + number2);
        System.out.println("Sum of the number is: " + sum);
        sc.close();
    }
}
