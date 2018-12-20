import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	double x[] = new double[100];
        System.out.printf("N[0] = %.4f\n",a);
        for (int i = 1; i < 100; i++){
            a /=2;
            System.out.printf("N[%d] = %.4f\n",i,a);
        }


    }
}
