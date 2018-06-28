public class PrintTwice {
    public static  void printTwice(String s){
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args) {
        printTwice("Nie każ mi mówić tego dwa razy");
        NewLine.newLine(); //wywołanie metody nowej lini z klasy NewLine
        String argument = "Nigdy nie mów nigdy";
        printTwice(argument);
    }
}
