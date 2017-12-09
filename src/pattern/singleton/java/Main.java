package pattern.singleton.java;

public class Main {
    public static void main(String[] args) {
        Singleton singlton1 = Singleton.getInstance();
        Singleton singlton2 = Singleton.getInstance();

        System.out.println(singlton1 == singlton2 ? "Same Instance" : "Diff Instance");

        TicketMaker maker1 = TicketMaker.getMaker();
        TicketMaker maker2 = TicketMaker.getMaker();

        System.out.println(maker1.getNextTicketNumber());
        System.out.println(maker1.getNextTicketNumber());
        System.out.println(maker1.getNextTicketNumber());
        System.out.println(maker1.getNextTicketNumber());

        System.out.println(maker2.getNextTicketNumber());
        System.out.println(maker2.getNextTicketNumber());
        System.out.println(maker2.getNextTicketNumber());
        System.out.println(maker2.getNextTicketNumber());
    }
}
