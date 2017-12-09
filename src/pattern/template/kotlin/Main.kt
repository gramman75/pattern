package pattern.template.kotlin

class Main{
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val chrDisp = CharDisplay('H')
            val strDisp = StringDisplay("Hello")

            chrDisp.display()
            strDisp.display()
        }
    }
}