import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double price = 0;
	Scanner scan = new Scanner(System.in);
	double x = scan.nextDouble();
	double y = scan.nextDouble();
	if (x == 1){
        price = (double) (4.00 * y);
    }else if(x == 2){
        price = (double) (4.50 * y);
    }else if (x == 3){
        price = (double) (5.00 * y);
    }else if (x ==4){
        price = (double) (2.00 * y);
    }else if (x == 5){
	    price = (double) (1.50 * y);
    }
        System.out.printf("Total: R$ %.2f\n",price);

    }
}
