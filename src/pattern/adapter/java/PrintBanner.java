package pattern.adapter.java;

public class PrintBanner extends Banner implements Print{
    public PrintBanner(String name){
        super(name);
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

    @Override
    public void printWeak() {
        showWithParen();
    }
}
