package Recorded;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = a;
        System.out.println("Printing just to remove warning due to redhat extension" + b);
        sc.close();
    }
}