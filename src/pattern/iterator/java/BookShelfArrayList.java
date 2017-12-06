package pattern.iterator.java;

import java.util.ArrayList;

public class BookShelfArrayList implements Aggregate {
    private ArrayList<Book> books = new ArrayList<Book>();

    public Book getBookAt(int index){
        return books.get(index);
    }

    public int getLength(){
        return this.books.size();
    }

    public void appendBook(Book book){
        this.books.add(book);
    }

    public BookShelfArrayListIterator iterator(){
        return new BookShelfArrayListIterator(this);
    }

}
