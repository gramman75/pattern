package pattern.iterator.java;

public class BookShelfIterator implements Iterator {
    private int index;
    private Aggregate bookShelf;

    public BookShelfIterator( Aggregate bookShelf){
        this.index = 0;
        this.bookShelf = bookShelf;
    }

    public boolean hasNext(){
        if (this.index < bookShelf.getLength())
            return true;
        else
            return false;
    }

    public Object next(){
        Book book = this.bookShelf.getBookAt(index);
        index++;

        return book;
    }
}
