package pattern.iterator.kotlin

class BookShelfIterator(var index: Int, var bookShelf: BookShelf): Iterator {

    override fun hasNext(): Boolean{
        return (index < bookShelf.getLength())
    }

    override fun next(): Any{
        val book = bookShelf.getBookAt(this.index)
        this.index++

        return book
    }
}