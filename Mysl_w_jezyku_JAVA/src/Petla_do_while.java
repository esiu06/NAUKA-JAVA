import java.util.Scanner;

public class Petla_do_while {

    public static double scanDouble() {
            Scanner in = new Scanner(System.in);
            boolean okey;
            do {
                System.out.print("Wprowadź liczbę: ");
                if (in.hasNextDouble()) {
                    okey = true;
                } else {
                    okey = false;
                    String word = in.next();
                    System.err.println(word + " nie jest liczbą");
                }
            } while (!okey);
            double x = in.nextDouble();
            return x;
    }

    public static double scanDouble2(){
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Wprowadź liczbę: ");
            if(in.hasNextDouble()) {
                break;
            }
                String word = in.next();
                System.err.println(word + " nie jest liczbą");
            }
        double x = in.nextDouble();
        return x;
    }
    public static double scanDouble3(){
        Scanner in = new Scanner(System.in);
        int x = -1;
        int sum = 0;
        while ((x != 0)) {
            x = in.nextInt();
            if (x <= 0) {
                continue;
            }
            System.out.println("Dodaję " + x);
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        scanDouble3();
    }
}