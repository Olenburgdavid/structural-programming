import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C = scan.nextFloat();
        float perimeterTriangle;
        float areaTraphisium;


        if ((A < (float) (B + C)) && (B < (float) (A + C)) && (C < (float) (B + A))) {
            perimeterTriangle = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimeterTriangle);

        } else {
            areaTraphisium = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", areaTraphisium);
        }
    }
}