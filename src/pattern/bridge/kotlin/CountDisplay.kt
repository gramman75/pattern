package pattern.bridge.kotlin

class CountDisplay(impl: DisplayImpl): Display(impl) {

    fun multiDisplay(cnt: Int){
        this.open()
        for (i in 1..cnt){
            this.print()
        }
        this.close()
    }


}