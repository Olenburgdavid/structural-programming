//URI 1154 AGES

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tot = 0;
        int average = 0;
        while (true) {
            int z = sc.nextInt();
            if (z < 0){break;}
            tot += z;
            average++;
        }
        float total = tot / average;
        System.out.printf("%.2f\n", total);
    }
}