package pattern.abstractFactory.factory.java;

public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url){
        super(caption);
        this.url = url;
    }

    public abstract String makeHTML();
}
