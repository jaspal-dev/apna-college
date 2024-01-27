package Recorded;

import java.util.Scanner;

public class Input1 {
    public static void main(String args[]) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        name = sc.next();
        System.out.println("My name is " + name);
        sc.close();
    }
}
