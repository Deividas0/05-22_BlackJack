import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Korta randomCard = generateRandomCard();                    // Generate random card.
        // System.out.println("Your random card is: " + randomCard);   // Printing out random card.

        List<String> kalade = generateDeckNormal();    // Generating deck of cards(By order).
        // Collections.shuffle(kalade);                   // Shuffling the deck.
        //printDeck(kalade);                             // Printing out deck of cards(By order).

        // Drawing 2 cards for the player. //////////////////////////////////////////////////////////////
        Zaidejas pirmasZaidejas = new Zaidejas("Jonas");
        Zaidejas antrasZaidejas = new Zaidejas("Antanas");
        getTwoCards(kalade);
        System.out.println(pirmasZaidejas.kortos.get(0));
        System.out.println(antrasZaidejas);
        /////////////////////////////////////////////////////////////////////////////////////////////////


    }

    public static Korta generateRandomCard() {         // Generating random card.
        Korta k = new Korta();

        Random r = new Random();
        String suit = k.suits[r.nextInt(k.suits.length)];
        String value = k.values[r.nextInt(k.values.length)];

        return new Korta(suit, value);
    }     // Generating random card.

    public static List<String> generateDeckNormal() {  // Generating normal deck(No shuffle)
        Korta k = new Korta();

        List<String> kalade = new ArrayList<>();

        for (String suit : k.suits) {
            for (String value : k.values) {
                kalade.add(value + " of " + suit);
            }
        }
        return kalade;
    }            // Generating normal deck(No shuffle)

    public static void printDeck(List<String> kalade) { // Printing normal deck(No shuffle)
        for (String korta : kalade) {
            System.out.println(korta);
        }
    }    // Printing normal deck(No shuffle)

    public static List<String> getTwoCards(List<String> kalade) throws InterruptedException {   // Get 2 cards from the deck.
        Zaidejas pirmasZaidejas = new Zaidejas("Jonas");
        Zaidejas antrasZaidejas = new Zaidejas("Antanas");
        Zaidejas z = new Zaidejas();
        Random r = new Random();

        // Getting the first card.
        int firstCard = r.nextInt(kalade.size());
        pirmasZaidejas.kortos.add(kalade.get(firstCard));
        //kalade.remove(firstCard);                             // Removing first drawn card from list.

        // Getting the second card.
        int secondCard = r.nextInt(kalade.size());
        pirmasZaidejas.pridetiKorta(kalade.get(secondCard));
        //kalade.remove(secondCard);                            // Removing second drawn card from list.

        // Getting the first card.
        firstCard = r.nextInt(kalade.size());
        antrasZaidejas.kortos.add(kalade.get(firstCard));
        //kalade.remove(firstCard);                             // Removing first drawn card from list.

        // Getting the second card.
        secondCard = r.nextInt(kalade.size());
        antrasZaidejas.pridetiKorta(kalade.get(secondCard));
        //kalade.remove(secondCard);                            // Removing second drawn card from list.

        return z.kortos;
    }   // Get 2 cards from the deck.

}