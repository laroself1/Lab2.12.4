/**
 * Created by LaroSelf on 02.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        Card[] deck = new Card[52];
        int counter = 0;

        for (int j = 0; j <= 3; j++) {

            for (int k = 0; k <= 12; k++) {

                deck[counter] = new Card(Suit.values()[j], Rank.values()[k]);
                counter++;
            }
        }
        for (Card card : deck) {
            System.out.println(card);
        }
    }}
