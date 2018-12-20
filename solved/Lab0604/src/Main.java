import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for (int i = 0; i <a.length;i++) {
            System.out.printf("Enter %d elements ", i);
            a[i]=sc.nextInt();
        }
        printArray("Before reversing",a);
        reverse(a);
        printArray("After reversing",a);
        }
        static void printArray(String msg, int[]a){
            System.out.println(msg);
        for (int e:a){
            System.out.print(e +" ");
        }
            System.out.println();
        }
        static void reverse(int []a){
        for (int i = 0; i<a.length/2;i++){
            int t = a[i];
            a[i]= a[a.length-1-i];
            a[a.length-1-i]=t;
        }
        }
}
