package pattern.strategy.java;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private Hand prevHand;
    private Random rand = new Random();
    private boolean won = false;

    public WinningStrategy(int seed){
        rand = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (this.won){
            return prevHand;
        } else {
            this.prevHand = Hand.getHand(rand.nextInt(3));
        }

        return prevHand;
    }

    @Override
    public void study(boolean result) {
        this.won = result;

    }
}
