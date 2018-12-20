import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("N:");
  int n = sc.nextInt();
  int[] a = new int[n];
  for (int i = 0; i <n; i++) {
 System.out.printf("Enter %d element ",i);
  a[i] = sc.nextInt();    }
 System.out.println("Before reversing:");
  for (int i = 0;i<n;i++){
   System.out.print(a[i]);  }
   System.out.println();
  int s =0;
  int e = n -1;
  while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;     }
 System.out.println("After reversing:");
  for (int j = 0;j <n;j++){
 System.out.print(a[j]);
        } } }
