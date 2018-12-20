//URI 1149 Summing Consecutive Integers;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b <= 0){b = sc.nextInt();}
        int sum = 0;
        for (int i = a; i < a + b; i++){
            sum += i;}
        System.out.println(sum);
    }
}

