package pattern.bridge.kotlin

open class Display(var impl: DisplayImpl) {
    fun open(){
        impl.rawOpen()
    }

    fun print(){
        impl.rawPrint()
    }

    fun close(){
        impl.rawClose()
    }

    fun display(){
        this.open()
        this.print()
        this.close()
    }

}