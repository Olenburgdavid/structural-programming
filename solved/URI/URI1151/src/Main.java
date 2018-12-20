//URI 1151 Easy Fibonacci

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b = 1, c = 0, a = 0;
        System.out.print("0");
        for (int i = 1; i < x; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.print(" "+c);
        }
        System.out.println();
    }
}
