package pattern.template.kotlin

class CharDisplay(var chr: Char): AbstractDisplay(){

    override fun open() {
        print("<<<")
    }

    override fun print() {
        print(this.chr)
    }

    override fun close() {
        println(">>>")
    }
}