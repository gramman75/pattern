package pattern.bridge.kotlin

class StringDisplayImpl(var str: String): DisplayImpl() {


    override fun rawOpen() {
        println("===========")
    }

    override fun rawPrint() {
        println(this.str)
    }

    override fun rawClose() {
        println("===========")
    }


}