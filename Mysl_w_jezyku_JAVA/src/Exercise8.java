import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {
        double[] a = { 1.0, 2.0, 3.0, 4.0};

        powArray(a, 3);
        System.out.println(Arrays.toString(a));
    }
    public static double[] powArray(double[] a, double n){
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], n);
        }
        return a;
    }
}
