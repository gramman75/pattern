package pattern.visitor.java;


public abstract class Visitor {
    abstract void visit(File file);
    abstract void visit(Directory dir);
}
