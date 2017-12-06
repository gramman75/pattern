package pattern.iterator.kotlin

class Book(var name: String){
    open fun getBookName(): String{
        return this.name
    }
}
