import java.math.BigInteger;

public class Big {
    public static int factorial(int n) {
        for (int i = 0; i < n; i++) {
            return n * factorial(n - 1);
        }
        return 1;
    }
    public static void printTable(){
        int i = 0;
        while (i <= 30){
            int x = i;
            System.out.println(x + "    " + factorial(x));
            i++;
        }
    }

    public static void main(String[] args) {
        printTable();


    }
}
