//URI 1101 Sequense of number and sum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status = true){


            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a <= 0 || b <= 0){status = false; break;}
            if (b < a ){
                int temp = b;
                    b = a;
                    a = temp;

            }
            int sum = 0;
            for (int i = a; i <= b; i++){
                sum += i;
                System.out.print(i +" ");

            }
            System.out.println("Sum="+ sum);
        }

    }
}
