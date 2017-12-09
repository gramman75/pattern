package pattern.template.java;

public class CharDisplay extends AbstractDisplay {
    Character chr;

    public CharDisplay(Character chr){
        this.chr = chr;
    }

    @Override
    public void open() {
        System.out.print("<<<");
    }

    @Override
    public void print() {
        System.out.print(this.chr);
    }

    @Override
    public void close() {
        System.out.println(">>>");
    }
}
