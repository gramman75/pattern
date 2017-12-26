package pattern.strategy.java;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Kim", new WinningStrategy(400));
        Player player2 = new Player("Lee", new ProbStrategy(300));

        for(int i=0; i < 1000; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();

            if (hand1.isStrongerThan(hand2)) {
                player1.win();
                player2.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                player1.lose();
                player2.win();
            } else {
                player1.even();
                player2.even();
            }
        }

        System.out.println(player1.toString());
        System.out.println(player2.toString());

    }
}
