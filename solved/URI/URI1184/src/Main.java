//URI 1184 BELLOW THE MAIN DIAGONAL
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float myList [][]= new float[12][12];
        float sum = 0;
        int k = 1;
        char z = sc.next().charAt(0);

        for (int i = 0; i < 12; i++){
            for (int j = 0; j <12; j++){
                myList[i][j] = sc.nextFloat();
            }
        }
        for (int i = 1; i < 12; i++){
            for (int j = 0; j < k; j++){

                sum += myList[i][j];
            }
             k+=1;
        }
        if (z == 'S') {
            System.out.printf("%.1f\n",sum);

        }else if (z == 'M') {
            float average = sum / 66;
            System.out.printf("%.1f\n",average);
        }
    }

}
