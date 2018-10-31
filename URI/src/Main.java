import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();

        int n  = 0;

        if (a > 0) n += 1;
        if (b > 0) n += 1;
        if (c > 0) n += 1;
        if (d > 0) n += 1;
        if (e > 0) n += 1;
        if (f > 0) n += 1;
        System.out.println(n + " valores positivos");


    }
}






