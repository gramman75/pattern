package pattern.factory.kotlin

class IDCard(var owner: String): Product(){

    override fun use() {
        println(this.owner)
    }

    fun get_Owner(): String{
        return this.owner
    }
}