package pattern.factory.kotlin

abstract class Factory{
    abstract fun createProduct(name: String): Product
    abstract fun registerProduct(product: Product)

    fun create(name: String): Product{
        var product = this.createProduct(name)
        this.registerProduct(product)

        return product
    }
}