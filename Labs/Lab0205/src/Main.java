import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Length in inches? ");
        double inches = scan.nextDouble();
        double sum = inches * 2.54;
        System.out.println(inches + " in. = " + sum + " cm");







    }
}
