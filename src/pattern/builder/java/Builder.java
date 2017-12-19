package pattern.builder.java;

import java.util.List;

public abstract class Builder {
    public abstract void makeTitle(String s);
    public abstract void makeString(String s);
    public abstract void makeItem(String[] item);
    public abstract void close();
}
