public class Exercise5 {
    int a;
    int b;
    int c;
    int n;

    public static void checkFermat(int a, int b, int c, int n) {
        if (n > 2 && (Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n)) {
            System.out.println("Kurka wodna, Fermat sie mylił!");
        } else {
            System.out.println("Nie, to nie działa");
        }
    }
}
