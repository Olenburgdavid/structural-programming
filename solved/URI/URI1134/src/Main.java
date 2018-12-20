//URI 1134

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int al = 0;
        int G = 0;
        int D = 0;
        int a = 0;

        while (a != 4) {
            a = sc.nextInt();

            if (a == 1) {
                al++;

            } else if (a == 2) {
                G++;
            } else if (a == 3) {
                D++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ al);
        System.out.println("Gasolina: "+ G);
        System.out.println("Diesel: "+ D);









    }


        }






