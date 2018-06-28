package Card;

import java.util.Arrays;
import java.util.Random;

import static sun.plugin2.os.windows.SECURITY_ATTRIBUTES.size;

public class Deck {

    private Card[] cards;



    public Deck(int n){
        this.cards = new Card[n];
    }
    public Deck(){
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }
    public void print(){
        for (int i = 0; i < this.cards.length; i++) {
            System.out.print(this.cards[i] + ", ");

        }
        System.out.println();
    }

    public String toString() {
//        StringBuilder sB = new StringBuilder(String.valueOf(cards));
//        sB.append(Arrays.toString(cards));
//        return String.valueOf(new StringBuilder(sB));
        return Arrays.toString(cards);
    }

    public Card[] get() {
        return cards;
    }

    public int randomInt(int low, int high){
        Random random= new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i);
        }
        return 0;
    }
    public void swapCards(int i, int j){
        Card low = cards[i];
        cards[i] = cards[j];
        cards[j] = low;

    }
    public int indexLowest(int low, int high){
        int lowIndex = 0;
        int highIndex = 0;
        for (int i = 0; i <= cards.length; i++) {

        }
        return 0;
    }
    public  void selectionSort() {
        for (int i = 0; i < cards.length; i++) {
            int index = i;
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[j].equals(cards[i])) {
                    index = j;
                }
                    Card low = cards[index];
                    cards[index] = cards[j];
                    cards[j] = low;

            }
        }
    }
    public void shuffle(){
        Random random= new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i);
            swapCards(i, j);

        }

    }
    public Deck subdeck(int low, int high){
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }
    public  Deck merge(Deck d1, Deck d2){

        Deck scal = new Deck();

        for (int i = 0; i <= d1.cards.length; i++) {
            for (int j = 1; j <= d2.cards.length; j++) {

                for (int k = 0; k < scal.cards.length ; k++) {
                    if (d1 == null){
                        return d2;
                    }if (d2 == null){
                        return d1;
                    }else {
                        d1.equals(d2);

                        j++;
                    }
                }
            }
        }
        return scal;
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.print();
        deck.shuffle();
        System.out.println("-----------------");
        deck.print();
        deck.selectionSort();
        System.out.println("-----------------");
        deck.print();
        System.out.println("-----------------");
        deck.subdeck(0,25);
        deck.print();

        Deck d1 = new Deck(26);
        Deck d2 = new Deck(26);
        System.out.println(d1);
        System.out.println(d2);
        deck.merge(d1, d2);
//
//
        System.out.println(deck.merge(d1, d2));
        System.out.println("-----------------");
        System.out.println(deck.toString());
        System.out.println("-------------------");


    }
}
