package pattern.observer.kotlin

class GraphObserver: Observer{
    override fun update(generator: NumberGenerator) {
        for(i in 1 .. generator.getNumber()){
            print("*")
        }

        println()
    }
}