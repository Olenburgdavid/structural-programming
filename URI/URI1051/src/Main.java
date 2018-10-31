// import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Locale.setDefault(Locale.US);
        float input, tax, increase;
        input = scan.nextFloat();
        if (input <= 2000.00){
            System.out.println("Isento");
        }else {
            if (input > 2000.00 && input <= 3000.00){
                increase = (float) (input - 2000.00);
                tax = (float) (increase / 100.00 * 8.00);
            }
            else if (input > 3000.00 && input <= 4500.00){
                increase = (float) (input - 3000.00);
                tax = (float) (increase / 100.00 * 18.00 + 80.00);

            }else  {
                increase = (float) (input - 4500.00);
                tax = (float) (increase / 100.00 * 28.00 + 350.00);

            }
            System.out.printf("R$ %.2f\n", tax);
        }


    }
}


