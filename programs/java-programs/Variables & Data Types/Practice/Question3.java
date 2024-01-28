package Practice;

import java.util.Scanner;

public class Question3 {
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pencil Cost: ");
        int pencilCost = sc.nextInt();
        System.out.print("Enter Pen Cost: ");
        int penCost = sc.nextInt();
        System.out.print("Enter Eraser Cost: ");
        int eraserCost = sc.nextInt();
        float totalCost = penCost + pencilCost + eraserCost;
        float totalCostWithGST = (totalCost + 0.18f) * totalCost;
        System.out.println("Total cost with GST is " + totalCostWithGST);
        sc.close();
    }
}
