package pattern.iterator.kotlin

import java.lang.reflect.Array

class BookShelf(maxLength: Int): Aggregate{


    var last: Int = 0
//    val books = Array<Book>(maxLength, { Book("KIM") })
    var books = arrayListOf<Book>()

    open fun getBookAt(index: Int): Book{
//        return this.books[index]
        return this.books.get(index)
    }

    open fun appendBook(book: Book): Unit{
        //this.books[this.last] = book
        this.books.add(book)
        this.last++
    }

    open fun getLength(): Int{
//        return this.books.size
        return this.books.size
    }


    override fun iterator(): Iterator{
        return BookShelfIterator(0,this)
    }

}