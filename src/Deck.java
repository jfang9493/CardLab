import java.util.ArrayList;

public class Deck {
    ArrayList<Card> unDealt = new ArrayList<Card>();
    ArrayList<Card> dealt = new ArrayList<Card>();

    public Deck()
    {

    }

    public boolean isEmpty()
    {
        if (dealt.size() == 0) return true;
        return false;
    }

    public Integer size()
    {
        return unDealt.size();
    }
}
