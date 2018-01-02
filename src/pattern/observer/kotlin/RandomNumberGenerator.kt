package pattern.observer.kotlin

import java.util.*

class RandomNumberGenerator: NumberGenerator(){
    val random: Random = Random()
    var _number: Int = 0

    override fun getNumber():Int{
        return this._number
    }

    override fun execute() {
        this._number = random.nextInt(50)
        this.notifyObservers()
    }

}