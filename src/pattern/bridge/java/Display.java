package pattern.bridge.java;

public class Display {
    DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open(){
        this.impl.rawOpen();
    }

    public void print(){
        this.impl.rawPrint();
    }

    public void close(){
        this.impl.rawClose();
    }

    public void display(){
        this.open();
        this.print();
        this.close();
    }
}
