package pattern.observer.kotlin

class Main{
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val digitObserver: DigitObserver = DigitObserver()
            val graphObserver: GraphObserver = GraphObserver()

            val generator: NumberGenerator = RandomNumberGenerator()
            generator.addObserver(digitObserver)
            generator.addObserver(graphObserver)

            generator.execute()

        }
    }
}