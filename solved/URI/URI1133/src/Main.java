import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (y > x) {
            int temp = y;
            y = x;
            x = temp;
        }
        int z = y + 1;
        for (int i = z; i < x; i++){
            if (i % 5 == 3 || i % 5 == 2){
                System.out.println(i);
            }
        }
    }
}
