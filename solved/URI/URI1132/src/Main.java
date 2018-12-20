//URI 1132 MULTIPLES OF 13;

}import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y > x) {
            int temp = y;
            y = x;
            x = temp;

        }
        for (int i = y; i <= x; i++) {
            if (i % 13 != 0)
                sum += i;
            else {
                sum = sum;
            }
        }
        System.out.println(sum);
    }
}