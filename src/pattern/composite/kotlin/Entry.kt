package pattern.composite.kotlin

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int
    abstract fun printList(name: String)
    fun printList(){
        this.printList("")
    }

    open fun add(entry: Entry): Entry{
        throw FileTreatmentException()
    }

    override fun toString(): String {
        return "${this.getName()}(${this.getSize()})"
    }



}