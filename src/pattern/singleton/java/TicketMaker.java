package pattern.singleton.java;

public class TicketMaker {
    private static TicketMaker maker = new TicketMaker();
    private TicketMaker(){

    }

    public static TicketMaker getMaker() {
        return maker;
    }

    private int ticket = 1000;

    public int getNextTicketNumber(){
        return ticket++;
    }

}
