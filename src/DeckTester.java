public class DeckTester {
    public static void main(String[] args)
    {
        String[] ranks = {"A","B","C","D"};
        String[] suits = {"Freshman", "Sophomore", "Junior", "Senior"};
        int[] values = {0, 1, 2, 3};

        Deck deck1 = new Deck(ranks, suits, values);
        deck1.shuffle();
        while (deck1.size() > 0)
        {
            System.out.println(deck1.deal());
        }
    }
}
