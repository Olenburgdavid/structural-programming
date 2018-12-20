import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int totalValid = 0;
        int x = 0;
        float score1,total = 0,average;
        Scanner sc = new Scanner(System.in);
        while (x != 2) {
            while (totalValid != 2) {
                score1 = sc.nextFloat();
                if (score1 >= 0.0 && score1 <= 10.0) {
                    total += score1;
                    totalValid += 1;

                }else {
                    System.out.print("nota invalida\n");
                }
                average =(float) total / 2;
                System.out.printf("media = %.2f\n",average);
            }
            x = sc.nextInt();
            if (x == 1) {
                System.out.println("novo calculo (1-sim 2-nao)\n");
            }

        }



    }
}
