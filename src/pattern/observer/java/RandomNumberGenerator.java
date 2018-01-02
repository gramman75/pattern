package pattern.observer.java;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    Random random = new Random();
    private int number = 0;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        this.number = random.nextInt(50);
        this.notifyObservers();
    }
}
