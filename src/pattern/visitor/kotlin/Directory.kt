package pattern.visitor.kotlin

class Directory(val _name: String): Entry(){
    val directory: ArrayList<Entry> = ArrayList()

    override fun getName(): String {
        return this._name
    }

    override fun getSize(): Int {
        val sizeVisitor = SizeVisitor()
        this.accept(sizeVisitor)

        return sizeVisitor.getSize()

    }

    override fun iterator(): Iterator<Element> {
        return this.directory.iterator();
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }

    override fun add(entry: Entry) {
        this.directory.add(entry)
    }
}