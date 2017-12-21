package pattern.strategy.java;

public class Player {
    private Strategy strategy;
    private int winCount = 0;
    private int loseCount = 0;
    private int evenCount = 0;
    private int gameCount = 0;
    private String name;

    public Player(String name, Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        this.winCount++;
        this.gameCount++;
        this.strategy.study(true);
    }

    public void lose(){
        this.loseCount++;
        this.gameCount++;
        this.strategy.study(false);
    }

    public void even(){
        this.evenCount++;
        this.gameCount++;
    }

    @Override
    public String toString() {
        return "[ Name : " + this.name + ", Game Count : "+this.gameCount + ", Win : "
                + this.winCount + ", Lose :"+this.loseCount + "Even : " + this.evenCount +"]";
    }
}
