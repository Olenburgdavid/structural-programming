public class Main {
 public static void main(String[] args) {
 double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
 System.out.println("before selection sort");
 for (double i:list){
  System.out.print(i+" ");
        }
 System.out.println();
 selectionSort(list);
  System.out.println("After selection sort ");
  for (double i:list){
 System.out.print(i+" ");
        } }
private static void selectionSort(double[] list){
   for (int i = 0; i < list.length - 1; i++) {
     double currentMin = list[i];
    int currentMinIndex = i;
       for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
       currentMin = list[j];
      currentMinIndex = j;
           } }
   if (currentMinIndex != i) {
   list[currentMinIndex] = list[i];
    list[i] = currentMin;
      } } } }




