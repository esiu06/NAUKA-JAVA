import java.util.Arrays;
import java.util.Random;

public class Tablice {

    public static void main(String[] args) {

        int[] counts = new int[4];
        int size = 10;
        double[] values = new double[size];


        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        int j = 0;
        while (j < 4) {
//            System.out.println(counts[j]);
            j++;
        }
//        System.out.println();

        for (int i = 0; i < 4; i++) {
//            System.out.println(counts[i]);
        }

//        int[] array = {1, 2, 3, 4};
//        printArray(array);
//        System.out.println(Arrays.toString(array));
//        double[] a = new double[3];
//        double[] b = new double[a.length];
////        for (int i = 0; i < a.length; i++) {
////            b[i] = a[i];
////        }
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) Math.pow(array[i], 2.0);
//        }
//
////        int [] b = Arrays.copyOf(array, 3);
//        System.out.println(Arrays.toString(array));
//        System.out.println(search(array, 7));
//        System.out.println(sum(array));
       int numValues = 8;
       int[] array = randomArray(numValues);
       printArray(array);
    }
    public static int sum(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
    public static int[] randomArray(int size){
        Random random = new Random();
        int [] a = new int [size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
    public static int search(int[] array, double target){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void printArray(int[] a) {

        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
}
