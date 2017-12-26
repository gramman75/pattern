package pattern.visitor.kotlin

interface Element{
    fun accept(v: Visitor)
}