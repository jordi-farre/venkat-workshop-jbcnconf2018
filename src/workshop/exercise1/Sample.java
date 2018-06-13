package workshop.exercise1;

import java.util.stream.IntStream;

class Sample {
  public static boolean isPrime(int number) {
    boolean divisible = IntStream.range(2, number)
            .anyMatch(n -> number % n == 0);
    return number > 1 && !divisible;
  } 
  
  public static void main(String[] args) {
    for(int i = 1; i < 8; i++) {
      System.out.printf("isPrime(%d)? %b\n", i, isPrime(i));
    }
  }              
}
