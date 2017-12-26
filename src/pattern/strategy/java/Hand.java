package pattern.strategy.java;

public class Hand {
    public static final int HANDVALUE_ROCK = 0;
    public static final int HANDVALUE_SCISSOR = 1;
    public static final int HANDVALUE_PAPER = 2;

    public static final Hand[] hand = {
            new Hand(HANDVALUE_ROCK),
            new Hand(HANDVALUE_SCISSOR),
            new Hand(HANDVALUE_PAPER)
    };

    private int handValue;

    public static final String[] name = {
            "주먹","가위","보"
    };

    public Hand(int handValue){
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue){
        return hand[handValue];
    }

    private int fight(Hand h){
        if (this.handValue == h.handValue)
            return 0;
        else if ( (this.handValue + 1) % 3 == h.handValue )
            return 1;
        else
            return -1;
    }
    public boolean isStrongerThan(Hand h){
        return this.fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h){
        return this.fight(h) == -1;
    }

    public String toString(){
        return name[this.handValue];
    }

}
