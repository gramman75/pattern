package pattern.template.java;

public class StringDisplay extends AbstractDisplay {
    String str;

    public StringDisplay(String str){
        this.str = str;
    }

    private void printLine(){
        System.out.println("+------------------+");
    }

    @Override
    public void open() {
        this.printLine();
    }

    @Override
    public void print() {
        System.out.println("+"+this.str+"+");
    }

    @Override
    public void close() {
        this.printLine();
    }
}
