public class Countdown {

        public static void countdown(int n){
            if (n == 0){
                System.out.println("Odpalamy!");
            }else{
                System.out.println(n);
                countdown(n - 1);
            }
    }
    public static void nLine(int n){
            if (n > 0){
                System.out.println();
                nLine(n - 1);
            }
    }

    public static void main(String[] args) {
        countdown(8);
        nLine(5);
        countdown(3);
    }
}
