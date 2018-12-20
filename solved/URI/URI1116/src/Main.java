import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for (int i = 1; i <= a; i++){
                float N1 = sc.nextFloat();
                float N2 = sc.nextFloat();
                float z = N1 / N2;
                if (N2 == 0){
                    System.out.println("divisao impossivel");}
                    else System.out.printf("%.1f\n",z);
            }



    }
}
