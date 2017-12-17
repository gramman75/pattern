package pattern.bridge.kotlin

abstract class DisplayImpl() {
    abstract fun rawOpen()
    abstract fun rawPrint()
    abstract fun rawClose()
}