package Recorded;

import java.util.Scanner;

public class Input2 {
    public static void main(String args[]) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        // Preserves spaces
        /*
         * Next function not preserves spaces.
         */
        name = sc.nextLine();
        System.out.println("My name is " + name);
        sc.close();
    }
}
