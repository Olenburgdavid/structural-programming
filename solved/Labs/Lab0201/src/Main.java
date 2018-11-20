import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A four - digit value? ");
        int n = scan.nextInt();
        int s = 0;

        s += n % 10;
        n /= 10;

        s += n % 10;
        n /= 10;

        s += n % 10;
        n /= 10;

        s += n % 10;
        n /= 10;

        System.out.print("The sum of all digits is: " + s);


    }
}