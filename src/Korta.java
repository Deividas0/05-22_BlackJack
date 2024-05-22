public class Korta {
    String suit;
    String value;
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Korta(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    public Korta(){}


    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
