import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int columns = sc.nextInt();
        int[][] a = new int[rows][columns];
        read2Arrey(a);
        System.out.println("Sum of elements is " + sum(a));
    }
    private static long sum(int[][] a) {
        long res = 0;
        for (int r = 0; r < a.length; r++) {
            for (int j = 0; j < a[r].length; j++) {
                res += a[r][j];
            } }
        return res;
    }
    private static int[][] read2Arrey(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int j = 0; j < a[r].length; j++) {
                a[r][j] = sc.nextInt();
            } }
        return a;
    } }