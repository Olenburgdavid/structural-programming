import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        int y = sc.nextInt();
        System.out.print("Month: ");
        int m = sc.nextInt();
        try {
    int d = getNumberOfDays(y, m);
    if (d != 0) {
    System.out.println("Number of Days " + d);
     } else {
     System.out.println("Incorrect data");
            }
   } catch (IllegalArgumentException e) {
   System.out.println(e.getMessage());
     } }
 private static int getNumberOfDays(int Year, int month) {
 int[] Months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 if (0 < month && month < 13) {
 if (month != 2) {
 return Months[month - 1];
 }return Months[1] + (isLeapYear(Year) ? 1 : 0);
 }throw new IllegalArgumentException("Incorrect number of month");
 }private static boolean isLeapYear(int y) {
 return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
    }}
