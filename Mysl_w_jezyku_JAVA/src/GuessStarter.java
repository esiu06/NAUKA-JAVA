import java.util.Random;
import java.util.Scanner;

/**
 * Program "Zgadnij moją liczbę".
 * Polega na tym, że prosimy urzytkownika o podanie dowolnej liczby z przedziału 1-100.
 * Wyganerowaniu losowej liczby oraz obliczenie o ile pomylił się urzytkownik.
 */

public class GuessStarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakąś liczbę z przedziału od 1 do 100:");
        int numberUser = scanner.nextInt();

        Random random = new Random();
        int numberRandom = random.nextInt(100) + 1;

        System.out.println("Moja liczba to: " + numberRandom);
        int result = numberUser - numberRandom;
        if (result <0){
            System.out.println("Pomyliłeś się o: " + Math.abs(result));
        }else{
            System.out.println("Pomyliłeś się o: " + result);
        }
    }
}
