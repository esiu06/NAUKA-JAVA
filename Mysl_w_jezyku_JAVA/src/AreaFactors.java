public class AreaFactors {
    /**
     *
     * @param n
     * @param tab
     * @return true jeśli wszystkie liczby przechowywane tablicy są czynnikami liczby przypisanej
     * (gdy n jest podzielne przez wszyskie te wartości).
     */
    public static boolean areFactors (int n, int[] tab){
        for (int i = 0; i < tab.length; i++) {
            if (n % tab[i] != 0){
                tab[i]++;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tab = {2, 4, 6};
        System.out.println(areFactors(12, tab));
    }

}
