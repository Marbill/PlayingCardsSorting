
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/* @author marbi */
public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int sum() {
        int total = 0;

        for (Card card : cards) {
            total += card.getValue();
        }

        return total;
    }

    @Override
    public int compareTo(Hand o) {
        if (this.sum() == o.sum()) {
            return 0;
        } else {
            return this.sum() > o.sum() ? 1 : -1;
        }
    }

    public void sortAgainstSuit() {
        this.sort();
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
