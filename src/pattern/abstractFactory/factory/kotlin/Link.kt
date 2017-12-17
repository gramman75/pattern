package pattern.abstractFactory.factory.kotlin

abstract class Link(caption: String, var url: String): Item(caption) {
    override abstract fun makeHTML(): String
}