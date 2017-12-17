package pattern.bridge.java;

public class Main {
    public static void main(String[] args) {
        Display disp = new Display(new StringDisplayImpl("Hello"));
        CountDisplay disp2 = new CountDisplay(new StringDisplayImpl("Hello"));

        disp.display();
        disp2.multiDisaply(5);
    }
}
