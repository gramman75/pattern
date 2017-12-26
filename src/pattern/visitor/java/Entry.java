package pattern.visitor.java;

public abstract class Entry implements Element{
    abstract String getName();
    abstract int getSize();
    public Entry add(Entry entry){
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return this.getName()+"("+this.getSize()+")";
    }
}
