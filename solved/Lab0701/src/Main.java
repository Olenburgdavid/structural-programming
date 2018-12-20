import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
        System.out.print("N:");
        int n = sc.nextInt();
        int []conts = new int[11];
        for (int i = 0; i< n;i++){
            int dice1 = 1 + rnd.nextInt(6);
            int dice2 = 1 + rnd.nextInt(6);
            ++conts[dice1 + dice2 - 2];
        }
        for (int i = 0; i <conts.length; i++){
            System.out.println(conts[i]);
        }


    }
}
