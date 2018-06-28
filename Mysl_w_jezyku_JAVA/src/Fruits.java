import java.util.Arrays;

public class Fruits {
    public static int babana(int[] a){
        int kiwi = 1;
        int i = 0;
        while (i < a.length){
            kiwi = kiwi * a[i];
        }
        return kiwi;
    }
    public static int grapefruit(int[] a, int grape){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape){
                return i;
            }
        }
        return -1;
    }
    public static int pineapple(int[] a, int apple){
        int pear = 0;
        for (int pine : a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

    public static void main(String[] args) {
        int[] a = {9,11,13,45,67};

//        System.out.println(grapefruit(a, 3));
//        System.out.println(Arrays.toString(a));
//        System.out.println(pineapple(a, 11));

    }
}
