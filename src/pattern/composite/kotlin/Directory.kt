package pattern.composite.kotlin

class Directory(var _name: String) : Entry(){
    val directory: ArrayList<Entry> = ArrayList<Entry>()

    override fun getName(): String {
        return this._name
    }

    override fun getSize(): Int {
        var totalSize = 0
        directory.map { totalSize += it.getSize() }
        return totalSize
    }

    override fun add(entry: Entry): Entry {
        this.directory.add(entry)
        return entry
    }

    override fun printList(prefix: String) {
        println("${prefix}/${this}")

        directory.forEach{ it.printList("${prefix}/${this._name}")}
    }
}