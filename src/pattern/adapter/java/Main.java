package pattern.adapter.java;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello Java");

        p.printStrong();
        p.printWeak();
    }
}
