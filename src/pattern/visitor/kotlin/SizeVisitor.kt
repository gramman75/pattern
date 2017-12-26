package pattern.visitor.kotlin

class SizeVisitor: Visitor(){
    var totalSize:Int = 0
    override fun visit(file: File) {
        this.totalSize += file.getSize()
    }

    override fun visit(dir: Directory) {

        val it = dir.iterator()
        while (it.hasNext()){
            val entry = it.next()
            entry.accept(this)
        }
    }

    fun getSize(): Int{
        return this.totalSize
    }
}