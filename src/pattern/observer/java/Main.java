package pattern.observer.java;

public class Main {
    public static void main(String[] args) {
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();

        NumberGenerator generator = new RandomNumberGenerator();
        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);

        generator.execute();
    }
}
