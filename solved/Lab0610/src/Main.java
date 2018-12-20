import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double start = 1;
        double end = 20;
        System.out.println("\ni        m(i)  ");
        System.out.println("-------------------");
        for (double i = start; i <=end; i+=1){
            System.out.printf("%-12.0f",i);
            System.out.printf("%-6.4f\n",testifyPi(i));
        } }
    private static Object testifyPi(double n) {
        double Pi = 0;
        for (double i = 1; i<=n; i++){
            Pi += i / (i + 1);
        }
        return Pi;
    }
}

