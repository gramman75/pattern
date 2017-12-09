package pattern.template.kotlin

abstract class AbstractDisplay{
    abstract fun open()
    abstract fun print()
    abstract fun close()

    fun display(){
        this.open()

        for (i in 1.. 5){
            this.print()
        }

        this.close()
    }
}