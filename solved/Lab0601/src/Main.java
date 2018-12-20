import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your coordinate? ");
        int x = sc.nextInt();
        System.out.print("Coordinates of 1st point: ");
        int x1 = sc.nextInt();
        System.out.print("Coordinates of 2nd point: ");
        int x2 = sc.nextInt();

        int d1 = abs(x - x1);
        int d2 = abs(x - x2);

        if (d1 < d2){
            System.out.printf("1st point is closer. Distence %d%n",d1);
        }else if (d1 > d2){
            System.out.printf("2nd point is closer. Distence %d%n",d2);
        }else {
            System.out.printf("Same distance %d%n",d1);
        }




    }

    private static int abs(int x) {
        int r = x;
        if (r < 0){
            r = -r;
        }
        return r;


    }
}

