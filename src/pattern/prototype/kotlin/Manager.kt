package pattern.prototype.kotlin

class Manager{
    var showcase: HashMap<String, Product> = HashMap()

    fun register(name: String, pro: Product){
        showcase.put(name, pro)
    }

    fun create(name: String): Product {

    }
}