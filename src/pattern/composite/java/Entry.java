package pattern.composite.java;

public abstract class Entry {
    abstract String getName();
    abstract int getSize();
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return this.getName()+"("+this.getSize()+")";
    }
}
