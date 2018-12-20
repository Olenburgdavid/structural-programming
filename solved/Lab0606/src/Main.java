import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inter number to sum: ");
        int n = sc.nextInt();
        sumDigets(n);

    }

    private static void sumDigets(long n) {
        int sum = 0;
        while (n != 0) {
            sum+= n%10;
            n /= 10;
        }
        System.out.printf("sum is %d ",sum);
    }

}
