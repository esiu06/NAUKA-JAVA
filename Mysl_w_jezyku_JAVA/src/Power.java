public class Power {
    public static double power(double x, int n){
        double result = Math.pow(x,n);
        if (n == 0){
            return 1;
        }else{
            result = (x * (Math.pow(x, n - 1)));
            return result;
        }

    }

    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
