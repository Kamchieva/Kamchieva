public class factorial24 {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

//   public static int factorial(int n) {
//        return 1;
//    }
//
    public static int factorial(int n) {

        if (n == 1) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }
        }



}