import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

      if (x >= 0 && x <= 25.0000){
          System.out.printf("Intervalo [0,25]\n");


      } else if (x >= 25.00001 && x <= 50.0000000){
          System.out.printf("Intervalo (25,50]\n");


     } else if (x >= 50.00001 && x <= 75.0000000){
          System.out.printf("Intervalo (50,75]\n");


      }else if (x >= 75.00001 && x <= 100.0000000){
          System.out.printf("Intervalo (75,100]\n");


      }else{
          System.out.print("Fora de intervalo\n");
      }
    }
}
