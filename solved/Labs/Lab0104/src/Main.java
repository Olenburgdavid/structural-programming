import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner main = new Scanner(System.in);

                System.out.print("inter three numbers:");
                double number1 = main.nextDouble();
                double number2 = main.nextDouble();
                double number3 = main.nextDouble();

                double averege = (number1 + number2 + number3) / 3;
                System.out.println("The averege of " + number1 + " " + number2 + " " + number3 + " is " + averege);


            }
}
