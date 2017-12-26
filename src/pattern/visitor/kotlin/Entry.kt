package pattern.visitor.kotlin

abstract class Entry: Element{
    abstract fun getName(): String
    abstract fun getSize(): Int
    open fun iterator(): Iterator<Element>{
        throw FileTreatmentException()
    }
    open fun add(entry: Entry){
        throw FileTreatmentException()
    }

    override fun toString(): String {
        return "${this.getName()}(${this.getSize()})"
    }
}