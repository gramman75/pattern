package pattern.adapter.kotlin

open class Banner(var name: String){
    var phone: String = "Default Phone Number"

    constructor(name: String, phone: String): this(name){
        var phone = phone
    }
    fun showWithParen(){
        println("($name)")
        println(phone)
    }

    fun showWithAster(){
        println("*$name*")
        println(phone)
    }
}