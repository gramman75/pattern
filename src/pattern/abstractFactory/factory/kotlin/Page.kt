package pattern.abstractFactory.factory.kotlin

abstract class Page(var title: String, var author: String) {
    var content: ArrayList<Item> = ArrayList<Item>()

    abstract fun add(item: Item)
    abstract fun makeHTML()
    abstract fun output()
}