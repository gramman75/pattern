package pattern.factory.kotlin

class Main{
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            var factory: Factory = IDCardFactory()

            var p1 = factory.create("Kim kotlin")
            var p2 = factory.create("Lee kotlin")

            p1.use()
            p2.use()


        }
    }
}