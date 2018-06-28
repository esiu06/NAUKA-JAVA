import java.util.Random;
import java.util.Scanner;

public class GuessStarter2 {

    public static void scannerUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakąś liczbę z przedziału od 1 do 100:");
        int numberUser = scanner.nextInt();
        if (numberUser <= 0) {

            System.err.println("Podałeś liczbę z poza przedziału!!!");
            System.out.println("Spróbuj jeszcze raz!!!");
            NewLine.newLine();
            scannerUser();
        }
        if (numberUser > 100){
            System.err.println("Podałeś liczbę z poza przedziału!!!");
            System.out.println("Spróbuj jeszcze raz!!!");
            NewLine.newLine();
            scannerUser();

        }

        Random random = new Random();
        int numberRandom = random.nextInt(100) + 1;

        if (numberUser > numberRandom){
            System.out.println("Twoja liczba jest za duża");
            System.out.println("Spróbuj jeszcze raz!");
            System.out.println("Moja liczba to: " + numberRandom);
            NewLine.newLine();
            scannerUser();
        }else{
            System.out.println("Twoja liczba jest za mała");
            System.out.println("Spróbuj jeszcze raz!");
            System.out.println("Moja liczba to: " + numberRandom);
            NewLine.newLine();
            scannerUser();
        }if (numberUser == numberRandom){
            int result = numberRandom;
            System.out.println("Moja liczba to: " + result);
            System.out.println("Brawo, odgadłeś moją liczbę");

        }
    }

    public static void main(String[] args) {
        scannerUser();
    }
}
