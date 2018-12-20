import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = 1;
        if (x > 0 || x < 13){
            for (int i = 1; i <= x; i++){f = f * i;}
            System.out.println(f);
        }
    }
}
