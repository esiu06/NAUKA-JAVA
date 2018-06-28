import java.util.Scanner;

public class Convert2 {
    public static void main(String[] args) {
        int secondUser;
        int second;
        int hour;
        int minute;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund:");
        secondUser = sc.nextInt();

        hour = secondUser / 60 / 60;
        minute = (secondUser / 60) % 60;
        second = secondUser % 60 % 60;

        System.out.printf("%d godz, %d minut, %d sekund", hour, minute, second );

    }

}
