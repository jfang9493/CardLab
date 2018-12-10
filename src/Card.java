public class Card {
    private String rank;
    private int suit;
    private int pointValue;

    public Card(String rank, int suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public boolean equals(Card otherCard)
    {
        if (otherCard.pointValue == pointValue) return true;
    }

    public String toString()
    {
        return ("Rank: " + rank + "    " + "Suit " + suit + "    " + "Point Value: " + pointValue);
    }
}
