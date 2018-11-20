import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double perc = 0;
        double points = scan.nextDouble();

        if (points > 0) {
            perc = 0.15;
        }
        if (points > 400) {
            perc = 0.12;
        }
        if (points > 800) {
            perc = 0.10;
        }
        if (points > 1200) {
            perc = 0.07;
        }
        if (points > 2000) {
            perc = 0.04;
        }
        double rv = points * perc;
        double ns = points + rv;
        perc = perc * 100;
        int perc2 = (int) perc;
        System.out.printf("Novo salario: %.2f\n", ns);
        System.out.printf("Reajuste ganho: %.2f\n", rv);
        System.out.println("Em percentual: " + perc2 + " %");

    }

}
