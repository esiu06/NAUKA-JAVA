package Pętle;

public class Wihle {

    public static void coundown(int n){
        while (n > 0){
            System.out.println(n);
            n = n -1;
        }
        System.out.println("Odpalamy!");
    }

    public static void sequence(int n){
        while (n != 1){
            System.out.println(n);
            if (n % 2 == 0){
                n = n / 2;
            }else{
                n = n * 3 + 1;
            }
        }
    }
    public static void main(String[] args) {
        coundown(3);
       sequence(16);

    }
}
