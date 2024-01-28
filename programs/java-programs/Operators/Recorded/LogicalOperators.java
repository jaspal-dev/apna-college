public class LogicalOperators {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("(b > a) && (a < b): " + ((b > a) && (a < b)));
        System.out.println("(b > a) && (a > b): " + ((b > a) && (a > b)));
        System.out.println("(b > a) || (a > b): " + ((b > a) || (a > b)));
        System.out.println(!true);
    }
}
