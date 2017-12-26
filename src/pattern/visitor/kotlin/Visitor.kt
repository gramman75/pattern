package pattern.visitor.kotlin

abstract class Visitor{
    abstract fun visit(file: File)
    abstract fun visit(dir: Directory)

}