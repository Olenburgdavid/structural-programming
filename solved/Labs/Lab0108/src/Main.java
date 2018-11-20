import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("inter an integer for seconds!");

        int Seconds = input.nextInt();

        int minutes = Seconds / 60;

        int remainingSeconds = Seconds % 60;

        System.out.println(Seconds + " Seconds is  " + minutes + " minutes and " + remainingSeconds + " Seconds ");

    }
}
