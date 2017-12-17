package pattern.abstractFactory.factory.kotlin

abstract class Tray(caption: String): Item(caption) {
    protected val tray = ArrayList<Item>()

    fun add(item: Item){
        this.tray.add(item)
    }
    override abstract fun makeHTML(): String
}