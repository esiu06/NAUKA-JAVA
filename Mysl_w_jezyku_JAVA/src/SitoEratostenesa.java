import java.util.Arrays;

public class SitoEratostenesa {
    public static void main(String[] args) {

     SitoEratostenesa sito = new SitoEratostenesa();
     sieve(100);
        System.out.println(sieve(100));

    }
    public static boolean[] sieve(int n){
        boolean[] tabPierwsze;
        tabPierwsze = new boolean[n];
        for (int i = 0; i < tabPierwsze.length; i++) {
            tabPierwsze[i] = true;
            }
        for (int i = 2; i < tabPierwsze.length; i++) {
            if (tabPierwsze[i]){
                for (int j = i + i; j < tabPierwsze.length; j = j +i) {
                    tabPierwsze[j] = false;
                }
            }

        }
        return tabPierwsze;
    }
}
