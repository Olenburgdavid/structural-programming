import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status = true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == y){status = false; break;}
            if (x > y){
                System.out.println("Decrescente");


            }
            else{
                System.out.println("Crescente");
            }

        }
    }
}
