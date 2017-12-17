package pattern.abstractFactory.factory.kotlin

abstract class Item(var caption: String) {
    abstract fun makeHTML(): String
}