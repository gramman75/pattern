package pattern.prototype.java;

public class Main {
    public static void main(String[] args) {
        UnderlinePen proto1 = new UnderlinePen('~');
        UnderlinePen proto2 = new UnderlinePen('_');

        Manager manager  = new Manager();
        manager.register("A", proto1);
        manager.register("B", proto2);

        Product p1 = manager.create("A");
        Product p2 = manager.create("B");

        p1.use("Hello");
        p2.use("Hello");

    }
}
