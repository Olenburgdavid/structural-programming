import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	double a = scan.nextDouble();
	double b = scan.nextDouble();
	double c = scan.nextDouble();
	double A1;
	double B2;

	if ((a == 0)|| (((b * b) - (4 * a * c)) < 0)) {
        System.out.print("Impossivel calcular\n");
	} else {
	    A1= ((-b + Math.sqrt(((b*b) -(4*a*c)))) / (2*a));
        B2 = ((-b - Math.sqrt(((b*b) -(4*a*c)))) / (2*a));

        System.out.printf("R1 = %.5f\n", A1);
        System.out.printf("R2 = %.5f\n", B2);
    }

    }
}
