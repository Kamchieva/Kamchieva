package Prime;
 import java.util.Scanner;

  public class Prime {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number; ");
          int number = sc.nextInt();
          if(isPrime(number, 2)){
              System.out.println(number + " is a prime number");
          } else {
              System.out.println(number + " is not a prime number");
          }
      }
          static boolean isPrime(int num, int divisor) {
           if(num <= 1) {
               return false;
           }
           if(divisor > Math.sqrt(num)){
               return true;
           }
              if (num % divisor == 0) {

                  return false;
              }
              return isPrime(num, divisor + 1);


}

}



