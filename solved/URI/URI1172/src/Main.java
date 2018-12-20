import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++){
            int b = sc.nextInt();
            if (b <= 0)b = 1;
            a [i] = b;
            System.out.println("X["+i+"] = "+b);
        }
    }
}
