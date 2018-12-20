import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();

        while (z <= x){z = sc.nextInt();}
        int sum = x;
        int count = 1;
        while (sum <= z){
            sum += x;
            x++;
            ++count;
        }
        System.out.println(count);
    }
}
