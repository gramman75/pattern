package pattern.singleton.kotlin


class Main{
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val singleton1 = Singleton
            val singleton2 = Singleton


            if (singleton1 == singleton2) println("Same Instance") else println("Diff Instance")

            val maker1 = TicketMaker
            val maker2 = TicketMaker
            println(maker1.getNextTicketNumber())
            println(maker1.getNextTicketNumber())
            println(maker1.getNextTicketNumber())
            println(maker1.getNextTicketNumber())

            println(maker2.getNextTicketNumber())
            println(maker2.getNextTicketNumber())
            println(maker2.getNextTicketNumber())
            println(maker2.getNextTicketNumber())

        }
    }
}