package pattern.interpreter.java;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
