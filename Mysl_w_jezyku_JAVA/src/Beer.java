public class Beer {
    public static void beer(int n) {
        if (n == 0) {
            System.out.println("Nie ma butelek piwa na regale,");
            System.out.println("nie ma butelek piwa,");
            System.out.println("nie możesz wziąć ani jednej, nie możesz podać jej dalej,");
            System.out.println("bo nie ma już więcej butelek piwa na regale!");
        } else {

            if (n == 1) {
                System.out.println(n + " butelka piwa na regale,");
                System.out.println(n + " butelka piwa,");
                System.out.println("weź jedną, podaj dalej,");
                System.out.println();
                beer(n - 1);

            }
            if (n <= 4 && n >= 2) {
                System.out.println(n + " butelki piwa na regale,");
                System.out.println(n + " butelki piwa,");
                System.out.println("weź jedną, podaj dalej,");
                System.out.println();
                beer(n - 1);
            }
            if (n < 100 && n > 4) {
                System.out.println(n + " butelek piwa na regale,");
                System.out.println(n + " butelek piwa,");
                System.out.println("weź jedną, podaj dalej,");
                System.out.println();
                beer(n - 1);

            }
        }
        return;
    }

    public static void main(String[] args) {
        beer(99);

    }
}
