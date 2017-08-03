
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        int result = card1.getSuit() - card2.getSuit();

        if (result == 0) {
            result = card1.getValue() - card2.getValue();
        }

        return result;
    }
}