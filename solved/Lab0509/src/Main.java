import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Inter a string: ");
  String s = sc.nextLine();
 int low = 0;
 int high = s.length() - 1;
 boolean isPolindrom = true;
  while (low < high) {
    if (s.charAt(low) != s.charAt(high)) {
   isPolindrom = false;
    break;
       }
    low++;
        high--;
        }
     if (isPolindrom)
       System.out.println(s + " is a palindrome");
    else
   System.out.println(s + " is not a palindrome");
    }
}