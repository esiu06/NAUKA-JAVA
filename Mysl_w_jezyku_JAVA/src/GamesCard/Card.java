package GamesCard;

public class Card {
    private final int rank;
    private final int suit;

    public static final String[] RANKS = {null, "as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "walet", "dama", "król"};
    public static final String[] SUITS = {"trefl", "karo", "kier", "pik"};


    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank(){
        return  this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public String toString(){
//        String[] rangs = {null, "as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "walet", "dama", "król"};
//        String[] suits = {"trefl", "karo", "kier", "pik"};
//        String s = rangs[this.rank] +" "+ suits[this.suit];
//        return s;
        return RANKS[this.rank] + " " + SUITS[this.suit];
    }
    public int compareTo(Card that){
        if (this.suit < that.suit){
            return -1;
        }
        if (this.suit > that.suit){
            return 1;
        }
        if (this.rank < that.rank){
            return  -1;
        }
        if (this.rank > that.rank){
            return 1;
        }
        return 0;
    }
    public boolean equals(Card that) {
        return this.rank == that.rank
                && this.suit == that.suit;
    }
    public int position() {
        return this.suit * 13 + this.rank - 1;
    }

}
