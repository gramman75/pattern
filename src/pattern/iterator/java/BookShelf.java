package pattern.iterator.java;

public class BookShelf implements Aggregate {
    private int last = 0;
    private Book[] books;

    public BookShelf(int maxLength){
        books = new Book[maxLength];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public int getLength(){
        return this.books.length;
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }

}
