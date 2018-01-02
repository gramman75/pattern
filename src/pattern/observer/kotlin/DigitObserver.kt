package pattern.observer.kotlin

class DigitObserver: Observer{
    override fun update(generator: NumberGenerator) {
        println(generator.getNumber())
    }
}