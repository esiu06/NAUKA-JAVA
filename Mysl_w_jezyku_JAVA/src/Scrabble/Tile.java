package Scrabble;

import java.util.Objects;

public class Tile {
    char letter;
    int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    public static void printTile (Tile tile){
        System.out.printf("%s,%d\n", tile.letter, tile.value);
    }
    public static Tile testTile (Tile tile){
        Tile tile1 = new Tile('Z', 10);
        Tile.printTile(tile1);
        return tile1;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public String toString() {
        return "Tile{" +
                "letter=" + letter +
                ", value=" + value +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return letter == tile.letter &&
                value == tile.value;
    }

    public static void main(String[] args) {

    }
}
