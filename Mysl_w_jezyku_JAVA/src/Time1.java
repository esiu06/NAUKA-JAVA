public class Time1 {
    public static void main(String[] args) {
        int hour = 17;
        int minute = 40;
        int second = 34;

        System.out.print("Liczba sekund, które upłyneły od północy to: ");
        System.out.println(hour * 60 * 60 + minute * 60 + second);

        System.out.print("Liczba sekund, które zostały do północy to: ");
        System.out.println(24 * 60 * 60 - hour * 60 * 60 + minute * 60 + second);

        double hour2 = 18.00;
        System.out.print("Odsetek dnia jaki już minął to: ");
        System.out.println(hour2 * 100 / 24);

        int hour3 = 20;
        int minute3 = 10;
        int second3 = 20;

        System.out.print("Czas, który minął od początku zadania to: ");
        System.out.println(hour3 - hour + " godz ");
    }
}
