package pattern.bridge.java;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl){
        super(impl);
    }

    public void multiDisaply(int count){
        this.open();
        for (int i=0; i < count; i++){
            this.print();
        }
        this.close();
    }
}
