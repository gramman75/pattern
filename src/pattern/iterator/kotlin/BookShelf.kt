package pattern.iterator.kotlin

import java.lang.reflect.Array

class BookShelf(maxLength: Int): Aggregate{
    var last: Int = 0
    var books = Array<Book>(maxLength, { Book("KIM") })


    open fun getBookAt(index: Int): Book{
        return this.books[index]
    }

    open fun appendBook(book: Book): Unit{
        this.books[this.last] = book
        this.last++
    }

    open fun getLength(): Int{
        return this.books.size
    }

    override fun iterator(): Iterator{
        return BookShelfIterator(0,this)
    }

}