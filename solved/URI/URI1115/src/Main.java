import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean statuse = true;
	while (statuse = true){
	    int x = sc.nextInt();
	    int y = sc.nextInt();


	    if (x > 0 && y > 0){
            System.out.println("primeiro");
        }else if (x > 0 && y < 0){
            System.out.println("quarto");
        }else if (x < 0 && y < 0){
            System.out.println("terceiro");
        }else if (x < 0 && y > 0 ) {
            System.out.println("segundo");

        } if (x == 0 || y == 0){statuse = false; break;}

        }
    }
    }

