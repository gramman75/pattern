package pattern.CoR.java;

public class Trouble {
    private int number;

    public Trouble(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public String toString() {
        return "Trouble Number: "+this.number;
    }
}
