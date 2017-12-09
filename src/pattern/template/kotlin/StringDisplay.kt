package pattern.template.kotlin

class StringDisplay(var str: String): AbstractDisplay(){
    private fun printLine() {
        println("+-------------+")
    }

    override fun open() {
        printLine()
    }

    override fun print(){
        println("+${this.str}+")
    }

    override fun close() {
        printLine()
    }
}