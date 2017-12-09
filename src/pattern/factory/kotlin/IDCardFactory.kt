package pattern.factory.kotlin

class IDCardFactory: Factory(){
    var owners = arrayListOf<IDCard>()

    override fun createProduct(name: String): Product {
        return IDCard(name)
    }

    override fun registerProduct(product: Product) {
        owners.add(product as IDCard)
    }
}