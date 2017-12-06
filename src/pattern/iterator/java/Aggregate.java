package pattern.iterator.java;

public interface Aggregate {
    Iterator iterator();
    Book getBookAt(int Index);
    int getLength();
    void appendBook(Book book);
}
