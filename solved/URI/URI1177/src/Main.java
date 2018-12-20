
//URI1177
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x[] = new int[1000];
        for (int i = 0; i < 1000; i++){
            int k = i % a;

            System.out.println("N["+i+"] = "+ k);
        }

    }
}
