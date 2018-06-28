public class Exercise4_2 {
    public static void zoop(){
        baffle();
        System.out.print("Ty chcesz ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("Nie, ja będę ");
        zoop();
        System.out.print("Ja będę ");
        baffle();
        NewLine.treeLine();
        zool(11," Tobi", " Ciemna");

    }

    private static void baffle() {
        System.out.print("pracować");
        ping();
    }

    private static void ping() {
        System.out.println(".");
    }

    public static void zool(int number, String name, String street){
        System.out.print(number);
        System.out.print(name);
        System.out.println(street);

    }

}
