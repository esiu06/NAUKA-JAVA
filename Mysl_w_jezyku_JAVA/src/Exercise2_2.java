public class Exercise2_2 {
    public static void main(String[] args) {
        double root = Math.sqrt(17);
        double angle = 1.5;
        double height = Math.sin(angle);
        System.out.println(height);

        double degrees = 90;
        double angle2 = degrees / 180.0 * Math.PI;
        System.out.println(angle2);

        double radians = Math.toRadians(180.0);
        double degrees2 = Math.toDegrees(Math.PI);
        System.out.println(radians);
        System.out.println(degrees2);

        double a = Math.PI * 20;
        long x = Math.round(Math.PI * 20.0);
        System.out.println(a);
        System.out.println(x);

        double x2 = Math.cos(angle + Math.PI / 2);
        System.out.println(x2);

        double x3 = Math.exp(Math.log(10.0));
        NewLine.newLine();
        System.out.println(x3);

        double x4 = Math.pow(2.0, 10.0);
        NewLine.newLine();
        System.out.println(x4);
    }

}
