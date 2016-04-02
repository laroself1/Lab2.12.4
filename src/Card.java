/**
 * Created by LaroSelf on 02.04.2016.
 */
public class Card {
    private Suit suit;
    private Rank rank;


    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "The card:"+ suit + "_" + rank ;
    }
}
