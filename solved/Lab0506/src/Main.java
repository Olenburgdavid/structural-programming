import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int data = 0;
	int sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter an enteger(the input will end if it is 0:)  ");
            data = sc.nextInt();

            sum += data;
        }while (data != 0);
        System.out.println("The sum is "+ sum);
    }
}
