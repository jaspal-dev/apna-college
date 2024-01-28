package Practice;

import java.util.Scanner;;

public class Question2 {
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of the square is: " + area);
        sc.close();
    }
}
