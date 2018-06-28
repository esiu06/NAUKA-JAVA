public class Multadd {
    public static double multadd(double a, double b, double c){
        return a * b + c;
    }


    private static double multadd(double a, double b) {
      return a + b;

    }
    public static double expSum (double x){

        return multadd((x * Math.exp(-x)), Math.sqrt((1 - Math.exp(-x))));

    }

    public static void main(String[] args) {
        System.out.println(multadd(1, 2, 3));

//       double a = Math.sin(Math.PI / 4);
//       double b = (Math.cos(Math.PI / 4) / 2);

       double a = Math.log(10);
       double b = Math.log(20);
       System.out.println(multadd(a, b));
       System.out.println(expSum(2));
    }
}
