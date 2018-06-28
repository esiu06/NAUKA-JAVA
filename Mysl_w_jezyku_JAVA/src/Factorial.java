public class Factorial {
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * (n-1);
    }
    public static int factorial2(int n) {
        for (int i = 0; i < n; i++) {
            return n * (n - 1);
        }
        return 1;
    }

    public static int fibonacci (int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
    public static boolean isDivisible(int n, int m){
        if (n % m == 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTriangle(int a, int b, int c){
        if ((a + b) < c || (a + c) < b || (b + c) < a ){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial2(0));
//        System.out.println("--------------------");
//        System.out.println(fibonacci(19));
//        System.out.println("--------------------");
//        System.out.println(isDivisible(10,5));
//        System.out.println("--------------------");
//        System.out.println(isTriangle(50,96,10));
    }
}
