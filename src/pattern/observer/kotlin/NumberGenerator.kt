package pattern.observer.kotlin

abstract class NumberGenerator{
    val observers: ArrayList<Observer> = ArrayList<Observer>()

    fun addObserver(observer: Observer){
        this.observers.add(observer)
    }

    fun deleteObserver(observer: Observer){
        this.observers.remove(observer)
    }

    fun notifyObservers(){
        observers.forEach { it.update(this) }
    }

    abstract fun getNumber(): Int
    abstract fun execute()

}