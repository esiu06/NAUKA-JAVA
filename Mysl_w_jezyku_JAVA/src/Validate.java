import java.util.Scanner;

public class Validate {

    public static double scanDouble() {

        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.println("Wprowadz liczbę: ");
            if (in.hasNextDouble()) {
                okay = true;
            } else {
                okay = false;
                String word = in.next();
                System.err.println(word + " nie jest liczbą");
            }
        } while (!okay);
        double x = in.nextDouble();
        return x;
    }
    public static double scanDouble2() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Wprowadz liczbę ");
            if (in.hasNextDouble()) {
                break;
            }
                String word = in.next();
                System.err.println(word + " nie jest liczbą");

        }
            double x = in.nextDouble();
            return x;

    }
    public static int scanDouble3(){
        Scanner in = new Scanner(System.in);
        int x = -1;
        int sum = 0;
        while (x != 0){
            x = in.nextInt();
            if (x <= 0){
                continue;
            }
            System.out.println("Dodaję " + x);
            sum += x;
        }
        return x;
    }

    public static void main(String[] args) {
        scanDouble3();
    }
}


