import java.util.Arrays;

public class Max2 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max){
                max = value;
            }
        }
        System.out.println("największa liczba to: " + max);
    }
}
