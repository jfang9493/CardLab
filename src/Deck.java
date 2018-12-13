import java.util.ArrayList;

public class Deck {
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt = new ArrayList<Card>();

    public Deck(String[] ranks, String[] suits, int[] values)
    {
        unDealt = new ArrayList<Card>();
        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < ranks.length; j++)
            {
                Card addCard = new Card(ranks[j], suits[j], values[j]);
                unDealt.add(addCard);
            }
        }
    }

    public boolean isEmpty()
    {
        if (Dealt.size() == 0) return true;
        return false;
    }

    public Integer size()
    {
        return unDealt.size();
    }

    public Card deal()
    {
        if(unDealt.size() > 0)
        {
            Dealt.add(unDealt.get(unDealt.size()-1));
            unDealt.remove(unDealt.get(unDealt.size()-1));
            return unDealt.get(unDealt.size()-1);
        }
        return null;
    }

    public void shuffle()
    {
        unDealt.addAll(Dealt);
        Dealt.clear();
        int rdm;
        Card temp;
        for(int k = unDealt.size()-1; k >= 1; k--)
        {
            rdm = (int)(Math.random()*k);
            temp = unDealt.get(rdm);
            unDealt.set(rdm, unDealt.get(k));
            unDealt.set(k,temp);
        }
    }
}
