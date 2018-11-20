import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);


	System.out.print("Number of points?");
	double points = scan.nextDouble();

	if (points >= 40) {
        System.out.println("You passed!!!");
    }else {

	System.out.println("You faild!!!");

    }
    }
}
