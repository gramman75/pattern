package pattern.bridge.java;


public class Main {
    public static void main(String[] args) {
        Display disp = new Display(new StringDisplayImpl("Hello"));
        CountDisplay disp2 = new CountDisplay(new StringDisplayImpl("Hello"));
        RandomDisplay disp3 = new RandomDisplay(new StringDisplayImpl("Hi"));

        disp.display();
        disp2.multiDisaply(5);
        disp3.randomDisplay(5);
    }
}
