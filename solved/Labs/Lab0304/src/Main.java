import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Year ");

        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();

        if(y % 400 == 0 || y % 4 == 0 && y % 100 != 0){

            System.out.println("This is a leap year ");

        }else {
            System.out.println("This is not the leap year ");
        }

    }
}
