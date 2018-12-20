import java.util.Scanner;
public class Main {
public static void main(String[] args) {
      int []a = new int [100];
       int input = 5;
Scanner sc = new Scanner(System.in);
System.out.print("Enter integer between 1 - 100: ");
    while (input != 0) {
     input = sc.nextInt();
      for (int i = 1; i<a.length;i++){
        if (input == i) {
          a[i] += 1;
                }
            }
        }
   for (int k = 1; k <a.length;k++){
   if (a[k] != 0) {
    System.out.print(k + " occurs "+ a[k]+" time");
      if (a[k] > 1) {
         System.out.println("s");
                }
        else System.out.println("");
            } }
        sc.close();
    } }
