public class Prod {
    public static void main(String[] args) {
        System.out.println(prod(1, 4));
    }

    private static int prod(int m, int n) {
        if (m == n){
            return n;
        }else{
            int recurse = prod(m, n - 1);
            int relult = n * recurse;
            return relult;
        }

    }
}
