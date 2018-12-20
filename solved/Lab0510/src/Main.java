public class Main {
    public static void main(String[] args) {
	final int numberOFprimes = 50;
	final int numberOFprimesperLine = 10;
	int count = 0;
	int number = 2;
System.out.println("the first 50 prime numbers are \n");
      while (count < numberOFprimes){
       boolean isPrime = true;
      for (int diviser = 2; diviser <= number /2; diviser++){
      if (number % diviser == 0){
      isPrime = false;
      break;
      }
      }
     if (isPrime) {
      count++;
      if (count % numberOFprimesperLine == 0) {
      System.out.println(number);
       }
      else System.out.print(number + " ");
            }
            number++;
        }
    }
}
