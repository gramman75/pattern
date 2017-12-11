package pattern.prototype.kotlin

interface Product: Cloneable {
    fun use(s: String)
    fun createClone(): Product
}