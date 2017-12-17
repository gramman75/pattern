package pattern.bridge.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val disp1  = Display(StringDisplayImpl("Hello"))
            val disp2 = CountDisplay(StringDisplayImpl("Hello"))
            disp1.display()

            disp2.multiDisplay(5)
        }
    }
}