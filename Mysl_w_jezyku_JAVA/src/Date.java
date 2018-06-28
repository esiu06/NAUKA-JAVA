public class Date {
    public static void printAmerican(String dey, int date, String month, int year){
        System.out.println(dey + ", " + month + " " + date + " " + year);
    }
    public static void printEuropean(String dey, int date, String month, int year){
        System.out.println(dey + ", " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {

        String dey = "piątek";
        int date = 13;
        String month = "lipec";
        int year = 2018;
        System.out.println("Format amerykański:");
        System.out.println(dey + ", " + month + " " + date + ", " + year);
        System.out.println("Format europejski:");
        System.out.println(dey + ", " + date + " " + month + " " +  year);
        NewLine.treeLine();
        printAmerican("Sroda", 11, "Styczań", 2016);
        printAmerican(dey, date, month, year);
        NewLine.newLine();
        printEuropean(dey, date, month, year);
    }
}
