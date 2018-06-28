import java.util.Arrays;

public class Max {
    public static int indexOfMax (int[] tab){
        int max = tab[0];
        int index = 0;
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]){
                index = i;
                max = tab[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] tab = {2, 41, 7, 9, 23};
        System.out.println(indexOfMax(tab));
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        int max2 = tab[tab.length - 1];
        int result = Arrays.asList(tab).indexOf(max2);
        System.out.println(result);

    }
}
