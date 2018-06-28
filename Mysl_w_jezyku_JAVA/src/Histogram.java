import java.util.Arrays;
import java.util.Random;

public class Histogram {
    public static void main(String[] args) {
        int[] scores = randomArray(100);
        int a = inRange(scores, 90, 100);
        int b = inRange(scores, 80, 90);
        int c = inRange(scores, 70, 80);
        int d = inRange(scores, 60, 70);
        int f = inRange(scores, 0, 60);

        System.out.println(Arrays.toString(scores));
        System.out.println(a);

        int[] counts = new int[100];
        for (int i = 0; i < counts.length; i++) {
            int index = scores[i];
            counts[index]++;
        }
        counts = new int[100];
        for (int score : scores) {
            counts[score]++;

        }
        System.out.println(Arrays.toString(counts));
    }
    public static int inRange(int[] a, int low, int high){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high){
                count++;
            }
        }
        return count;
    }
    public static int[] randomArray(int size){
        Random random = new Random();
        int [] a = new int [size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
