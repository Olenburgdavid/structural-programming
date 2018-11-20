import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a, b, c, d;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        if (b > c && d > a && c + d > a + b && c >= 0 && a % 2 == 0){
            System.out.printf("Valores aceitos\n");

        }else {
            System.out.printf("Valores nao aceitos\n");
        }


    }
}
