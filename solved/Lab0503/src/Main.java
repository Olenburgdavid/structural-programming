import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Number of tests? ");
        int n = sc.nextInt();

        int nCorrect = 0;
        int i = 0;
        while (i < n) {
            int a = rnd.nextInt(101);
            int b = rnd.nextInt(101);
            System.out.printf("%d + %d = ", a, b);
            int r = sc.nextInt();
            if (a + b == r) {
                ++nCorrect;
            }
            ++i;


        }
        System.out.println("Number of correct answers: " + nCorrect);
    }

    }
       





