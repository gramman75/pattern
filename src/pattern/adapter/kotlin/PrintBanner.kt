package pattern.adapter.kotlin

class PrintBanner: Banner, Print{
    constructor(name: String): super(name)
    constructor(name: String, phone: String): super(name, phone){
        println("execute secondary constructor")

    }

    override fun printStrong() {
        showWithAster()
    }

    override fun printWeak() {
        showWithParen()
    }


}