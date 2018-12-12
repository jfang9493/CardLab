import java.util.ArrayList;

public class Deck {
    ArrayList<Card> unDealt = new ArrayList<Card>();
    ArrayList<Card> dealt = new ArrayList<Card>();

    public Deck(String[] ranks, int[] suits, int[] values)
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

    public Card deal()
    {
        if (unDealt.size() == 0) return null;
        dealt.add(unDealt.get(unDealt.size()-1));
        unDealt.remove(unDealt.get(unDealt.size()-1));
        return unDealt.get(unDealt.size()-1);
    }

    public void shuffle()
    {
        for (int i = 0; i < dealt.size(); i++)
        {
            unDealt.add(dealt.get(i));
            dealt.remove(i);
        }
        int rdm, temp;
        for(int i = 51; i <= 1; i --)
        {
            rdm = (int)((Math.random()*51)+1);
            temp = unDealt[rdm];
            cards[rdm] = cards[i];
            cards[i] = temp;
        }
    }
}
