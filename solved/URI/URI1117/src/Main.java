import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 0;
	float sum = 0;
    while (n < 2){
        double a = sc.nextDouble();
        if (a < 0 || a > 10){
            System.out.println("nota invalida");}
            else {
                n++;
                sum += a;
        }

    }
    float media = sum / 2;
        System.out.printf("media = %.2f\n", media);
    }
}
