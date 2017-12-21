package pattern.strategy.java;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private Random rand;
    private int[][] history = {
            {1,1,1},
            {1,1,1},
            {1,1,1}
    };

    public ProbStrategy(int seed){
        this.rand = new Random(seed);
    }

    private int getSum(int hv){
        int sum = 0;
        for(int i=0; i<3; i++){
            sum +=this.history[hv][i];
        }
        return sum;
    }

    @Override
    public Hand nextHand() {
        int handValue = 0;
        int bet = rand.nextInt(this.getSum(this.currentHandValue));
        if (bet < history[this.currentHandValue][0])
            handValue = 0;
        else if (bet < history[this.currentHandValue][1])
            handValue = 1;
        else
            handValue = 2;

        this.prevHandValue = currentHandValue;
        this.currentHandValue = handValue;

        return Hand.getHand(handValue);
    }

    @Override
    public void study(boolean result) {
        if (result){
            history[this.prevHandValue][this.currentHandValue]++;
        } else {
            history[this.prevHandValue][ (this.currentHandValue+1) % 3]++;
            history[this.prevHandValue][ (this.currentHandValue+2) % 3]++;
        }

    }
}
