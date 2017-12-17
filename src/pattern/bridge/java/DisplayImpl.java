package pattern.bridge.java;

public abstract class DisplayImpl {
    protected String str;
    public DisplayImpl(String str){
        this.str = str;
    }
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();

}
