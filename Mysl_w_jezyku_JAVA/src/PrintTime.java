public class PrintTime {
    public static void printTime(int hour, int minute){
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }

    public static void main(String[] args) {
        printTime(11,59);
    }
}
