package pattern.visitor.kotlin

class ListVisitor:Visitor(){
    var currentDir = ""
    override fun visit(file: File) {
        println("${this.currentDir}/${file}")
    }

    override fun visit(dir: Directory) {
        println("${this.currentDir}/${dir}")
        var savedDir = this.currentDir
        this.currentDir = this.currentDir + "/" +dir.getName()
        val it = dir.iterator()
        while (it.hasNext()){
            val entry  = it.next()
            entry.accept(this)
        }

        this.currentDir = savedDir
    }
}