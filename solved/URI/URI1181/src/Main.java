//IRI LINE IN ARRAY

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [][]a = new float[12][12];
        float sum = 0;
        int col = sc.nextInt();
        char step = sc.next().charAt(0);
        for (int i = 0; i <12; i++){
            for (int j = 0; j <12; j++){
                a[i][j] = sc.nextFloat();

            }
        }
        for (int i = 0; i <12; i++){
            sum += a[col][i];
        }
        if (step == 'S') {
            System.out.printf("%.1f\n",sum);

        }
        if (step == 'M'){
            System.out.printf("%.1f\n", sum/12);
        }
    }
}
