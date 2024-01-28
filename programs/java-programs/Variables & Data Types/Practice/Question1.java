package Practice;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter Number 3: ");
        int c = sc.nextInt();
        float result = (a + b + c) / 3f;
        System.out.println("Result of the Numbers is: " + result);
        sc.close();
    }
}
