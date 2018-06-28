public class Exercise6 {
    public static boolean isDivisible(int n, int m){
        if (n % m == 0){
            return true;
        }else{
            return false;
        }
    }public static boolean isTriangle(int a, int b, int c){
        if (a + b < c || a + c < b || b + c <a){
            return false;

        }else{
            return true;

        }
    }
    public static int oddSum(int n) {
        int suma = n;
        if (n == 0) {
            return 0;
        }
        if (n % 2 != 0) {
            System.out.println(n);
            suma += n;
            oddSum(n - 1);
            return suma;
        } else {
            oddSum(n - 1);
        }

       return suma;
    }



    public static void main(String[] args) {
//        System.out.println(isDivisible(9,2));
//        System.out.println();
//        System.out.println(isTriangle(2, 2, 3));
//        System.out.println();
        System.out.println(oddSum(10));
    }
}
