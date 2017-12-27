package pattern.composite.kotlin

class File(val _name: String, val _size: Int): Entry(){
    override fun getName(): String {
        return this._name
    }

    override fun getSize(): Int {
        return this._size
    }

    override fun printList(prefix: String) {
        println("${prefix}/${this}")
    }

}