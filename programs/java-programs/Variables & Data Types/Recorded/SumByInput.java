package Recorded;

import java.util.Scanner;

public class SumByInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        byte number1 = sc.nextByte();
        System.out.print("Enter Number 2: ");
        byte number2 = sc.nextByte();
        byte sum = (byte) (number1 + number2);
        System.out.println("Sum of two numbers is " + sum);
        sc.close();
    }
}
