import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		System.out.println(i);
		int divide100;
		divide100 = i / 100;
        System.out.printf("%d nota(s) de R$ 100,00\n", divide100);
        int remainder100;
        remainder100 = i % 100;
        int divide50;
        divide50 = remainder100 / 50;
		System.out.printf("%d nota(s) de R$ 50,00\n", divide50);
		int david;
		david = i % 100 % 50;
		int sum = david / 20;
		System.out.printf("%d nota(s) de R$ 20,00\n", sum);
		int egor;
		egor = i % 100 % 50 % 20;
		int sam = egor / 10;
		System.out.printf("%d nota(s) de R$ 10,00\n", sam);
		int one;
		one = i % 100 % 50 % 20 % 10;
		int total = one / 5;
		System.out.printf("%d nota(s) de R$ 5,00\n", total);
		int two;
		two = i % 100 % 50 % 20 % 10 % 5;
		int five = two / 2;
		System.out.printf("%d nota(s) de R$ 2,00\n", five);
		int last;
		last = i % 100 % 50 % 20 % 10 % 5 % 2;
		int average = last / 1;
		System.out.printf("%d nota(s) de R$ 1,00\n", average);





		}
	}
