package pattern.iterator.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {


            var bookShelf = BookShelf(5)
            bookShelf.appendBook(Book("A"))
            bookShelf.appendBook(Book("B"))
            bookShelf.appendBook(Book("C"))
            bookShelf.appendBook(Book("D"))
            bookShelf.appendBook(Book("E"))
            bookShelf.appendBook(Book("F"))

            var it: Iterator = BookShelfIterator(0, bookShelf)

            while (it.hasNext())
            {
                var b = it.next() as Book
                println(b.getBookName())
            }
        }
    }
}