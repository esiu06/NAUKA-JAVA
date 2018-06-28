public class NewLine {
    public static void newLine(){
        System.out.println();
    }
    public static void treeLine(){
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("Pierwsza linia.");
        treeLine();
        System.out.println("Druga linia.");

    }
}
