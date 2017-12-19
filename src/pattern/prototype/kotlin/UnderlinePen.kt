package pattern.prototype.kotlin

class UnderlinePen(val ulchar: Char): Product{

    override fun use(s: String) {
        val length = s.length
        println(s)
        for(i in 1..length){
            print(this.ulchar)
        }

        println()
    }

    override fun createClone(): Product? {
        var p: Product? = null
        try{
            p = this.clone() as Product
        } catch (e: CloneNotSupportedException){
            e.printStackTrace()
        }

        return p
    }
}