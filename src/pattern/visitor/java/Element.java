package pattern.visitor.java;

public interface Element {
    public abstract void accept(Visitor visitor);
}
