import java.util.ArrayList;

public class CardSet {
    public String[] Suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public String[] Rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public Card[] cards = new Card[52];

    public CardSet() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                cards[i * 4 + j] = new Card(Suit[j], Rank[i]);
            }
        }
    }

    public ArrayList<Card> CardSetRandom() {
        ArrayList<Card> result = new ArrayList<>();
        ArrayList<Integer> availableIndices = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            availableIndices.add(i);
        }

        for (int i = 0; i < 52; i++) {
            int randomIndex = (int) (Math.random() * availableIndices.size());
            int cardIndex = availableIndices.remove(randomIndex);
            result.add(cards[cardIndex]);
        }
        return result;
    }
}
