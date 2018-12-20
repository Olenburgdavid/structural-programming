//URI 1183 ABOVE THE MAIN DIAGONAL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float [][]a = new float[12][12];
	float sum = 0;

	char step = sc.next().charAt(0);
	int z = 1;

	for (int i = 0; i < 12; i++){
	    for (int j = 0; j < 12; j++){
	        a [i][j] = sc.nextFloat();
        }
    }
    for (int i = 0; i < 11; i++){
        for (int j = z; j < 12; j++){
            sum += a[i][j];

        }
        z++;
    }
        if (step =='S') {
            System.out.printf("%.1f\n",sum);
        }
        if (step =='M') {
            System.out.printf("%.1f\n", sum/66);
        }
    }
}
