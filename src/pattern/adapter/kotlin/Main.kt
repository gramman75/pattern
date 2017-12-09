package pattern.adapter.kotlin



class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var p: Print =PrintBanner("Hello Kotlin", "010")
            p.printWeak()
            p.printStrong()


        }
    }
}