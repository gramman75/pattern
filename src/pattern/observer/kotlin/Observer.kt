package pattern.observer.kotlin

interface Observer{
    fun update(generator: NumberGenerator)
}