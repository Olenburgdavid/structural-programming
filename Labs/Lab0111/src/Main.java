import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 1st double?");
        double a = scan.nextDouble();
        System.out.println(" 2nd double?");
        double b = scan.nextDouble();

        double sum = a + b;


        System.out.println("a + b = " + sum);
        System.out.println("a + b = " + (a - b));
        System.out.println("a + b = " + a * b);
        System.out.println("a + b = " + a / b);
        System.out.println("a + b = " + a % b);

    }
}
