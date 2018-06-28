public class Metody {

    public static void countup(int n){
        if (n == 0) {
            System.out.println("Odpalamy");
        }else {
            countup(n-1);
            System.out.println(n);
        }
    }

    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double absoluteValue(double x){
        if (x < 0) {
            return -x;
        }else{
            return x;
        }
    }

    public static double distance (double x1, double y1, double x2, double y2 ){
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

    public static double calculateArea(double xc, double yc, double xp, double yp){
       return calculateArea(distance(xc, yc, xp, yp));
    }

    /**
     * Sprawdza czy x jest jednocyfrową liczbą całkowitą
     *
     * @param x liczba całkowita do sprawdzenia
     * @return true, jeśli x jest liczbą jednocyfrowa, false w przeciwnym przypadku
     */

    public static boolean isSingleDigit(int x){
        if (x > -10 && x < 10){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isSingleDigit2(int z) {
        if (isSingleDigit(z)) {
            System.out.println("z jest małe");
        } else {
            System.out.println("z jest duże");
        }
        return true;
    }


    public static void main(String[] args) {

        countup(3);
        System.out.println("Miłego dnia");
//        System.out.println("--------------");
//        System.out.println(distance(1.0, 2.0, 4.0, 6.0));
//        System.out.println("--------------");
//        System.out.println(calculateArea(3));
//        System.out.println("--------------");
//        System.out.println(calculateArea(1.0, 2.0, 4.0, 6.0));
//        System.out.println("--------------");
//
//        double x = calculateArea(3);
//        double y = calculateArea(1.0, 2.0, 4.0, 6.0);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println("--------------");
//        System.out.println(isSingleDigit(12));
//        System.out.println(isSingleDigit(5));
//        boolean bigFlag = !isSingleDigit(17);
//        System.out.println(bigFlag);
//        System.out.println("--------------");
//        System.out.println(isSingleDigit2(5));


    }
}
