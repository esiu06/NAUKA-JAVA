public class Tables {

    public static void exemple() {
        int i = 1;
        while (i < 10) {
            double x = (double) i;
            System.out.println(x + "   " + Math.log(x));
            i = i + 1;
        }
    }
    public static void exemple2() {
        int i = 1;
        while (i < 10) {
            double x = (double) i;
            System.out.println(x + "   " + Math.log(x) / Math.log(2));
            i = i + 1;
        }
    }
    public static void exemple3() {
        final double LOG2 = Math.log(2);
        int i = 1;
        while (i < 100){
            double x = (double) i;
            System.out.println(x + "   " + Math.log(x) / LOG2);
            i = i * 2;
        }
    }
    public static void printRow() {
        int i = 1;
        while (i <=6){
            System.out.printf("%4d", 2 * i);
            i = i + 1;
        }
        System.out.println();
    }
    public static void printRow(int n) {
        int i = 1;
        while (i <=10){
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }
    public static void multiplicationTable() {
        int i = 1;
        while (i <= 10){
            printRow(i);
            i = i +1;
        }
    }
    public static void multiplicationTable2(int rows) {
        int i = 1;
        while (i <= rows){
            printRow(i);
            i = i +1;
        }
    }
    public static void printRow(int n, int cols) {
        int i = 1;
        while (i <= cols){
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }
    public static void multiplicationTable3(int rows) {
        int i = 1;
        while (i <= rows){
            printRow(i, rows);
            i = i +1;
        }
    }
    public static void multiplicationTable4(int rows) {
        int i = 1;
        while (i <= rows){
            printRow(i, i);
            i = i +1;
        }
    }
    public static void printTable(int rows){
        for (int i = 1; i <= rows ; i++) {
            printRow(i, rows);
        }
    }



    public static void main(String[] args) {
//        exemple();
//        System.out.println("--------------------------------");
//        exemple2();
//        System.out.println("--------------------------------");
//        exemple3();
//        System.out.println("--------------------------------");
//        printRow();
//        System.out.println("--------------------------------");
//        printRow(5);
//        System.out.println("--------------------------------");
//        multiplicationTable();
//        System.out.println("--------------------------------");
//        multiplicationTable2(7);
//        System.out.println("--------------------------------");
//        multiplicationTable3(7);
//        System.out.println("--------------------------------");
//        printRow(5, 7);
//        System.out.println("--------------------------------");
//        multiplicationTable4(7);
//        System.out.println("--------------------------------");
        printTable(6);

    }
}