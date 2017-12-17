package pattern.bridge.java;

public class StringDisplayImpl extends DisplayImpl {

    public StringDisplayImpl(String str){
        super(str);
    }
    @Override
    public void rawOpen() {
        System.out.println("==========");
    }

    @Override
    public void rawPrint() {
        System.out.println("+ "+this.str+" +");

    }

    @Override
    public void rawClose() {
        System.out.println("=========");
    }
}
