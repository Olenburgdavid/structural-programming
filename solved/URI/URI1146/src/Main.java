//URI1146 Growing Sequences;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            String s = " ";
            for (int i = 1; i <= n; i++) {
                s = s + i + " ";

                }s = s.trim();
                System.out.println(s);
            }
        }
    }
