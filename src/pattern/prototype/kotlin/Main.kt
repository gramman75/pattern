package pattern.prototype.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val product1 = UnderlinePen('_')
            val manager = Manager()

            manager.register("Pen", product1)


        }
    }
}