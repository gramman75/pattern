package pattern.iterator.kotlin

class Main {
    fun main(args: Array<String>){
        var bookShelf = BookShelf(5)
        bookShelf.appendBook(Book("A"))
        bookShelf.appendBook(Book("B"))
        bookShelf.appendBook(Book("C"))
        bookShelf.appendBook(Book("D"))
        bookShelf.appendBook(Book("E"))

        var it: Iterator = BookShelfIterator(0, bookShelf)

        while(it.hasNext()) {
            var b = it.next() as Book
            println(b.getBookName())
        }
    }
}