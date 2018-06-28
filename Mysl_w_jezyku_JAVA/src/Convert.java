import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {

        double stCelsiusz;
        double stFahrenheita;

        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadź wartość temperatury w st. Celcjusza:");
        stCelsiusz = sc.nextDouble();

        stFahrenheita = (stCelsiusz * 1.8) + 32;

        System.out.printf("%.2fC = %.2fF", stCelsiusz, stFahrenheita);




    }
}
