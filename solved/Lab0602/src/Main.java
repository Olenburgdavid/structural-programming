
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year:");
        int y = sc.nextInt();
        System.out.print("Month:");
        int m = sc.nextInt();
        int d = getNumberfOfDays(y, m);
        if (d != 0) {
            System.out.println("Number of days " + d);
        } else {
            System.out.println("Incorect data");
        }
    }

    private static int getNumberfOfDays(int y, int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(y) ? 29 : 28;
                default:
                    return 0;

        }
    }

    private static boolean isLeapYear(int y) {

        return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
    }
}




